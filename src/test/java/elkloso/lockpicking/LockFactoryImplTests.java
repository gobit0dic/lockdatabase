package elkloso.lockpicking;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockService;
import elkloso.lockpicking.lockEntries.LockServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class LockFactoryImplTests {

    @Test
    public void writeLockPositive(){
        Lock lock = new Lock();
        lock.setName("Test");
        lock.setUserId("1");

        LockFactoryImpl lockFactory = new LockFactoryImpl();
        Lock lockReturn = lockFactory.writeLock(lock);
        assert(lockReturn.getId() != null);

        String path = System.getProperty("user.dir") + "/mockDatabase/locks/1.json";

        File file = new File(path);
        assert(file.exists());

        try{
            String data = Files.readString(Path.of(path));
            System.out.println(data);
            String toCheckName = "\"name\":\"Test\"";
            String toCheckId = "\"userId\":\"1\"";
            assert(data.contains(toCheckName));
            assert(data.contains(toCheckId));
        }catch (Exception e){
            assert false;
        }
        //file.delete();

    }

    @Test
    public void writeLockEmptyRecord(){
        Lock lock = new Lock();
        LockFactoryImpl lockFactory = new LockFactoryImpl();
        Lock lockReturn = lockFactory.writeLock(lock);
        assert(lockReturn == null);

        String path = System.getProperty("user.dir") + "/mockDatabase/locks/null.json";

        File file = new File(path);
        assert(!file.exists());
    }

    @Test
    public void getAllLocksWithLock() {
        LockFactoryImpl lockFactory = new LockFactoryImpl();
        Lock[] locks = lockFactory.getAllLocks();
        assert(locks != null);
    }

    @Test
    public void getSingleLockNoLock() {
        LockFactoryImpl lockFactory = new LockFactoryImpl();
        Lock lock = lockFactory.getSingleLock("123");
        assert(lock == null);
    }

    @Test
    public void deleteLock() {
        Lock lock = new Lock();
        String id = "Test";
        lock.setId(id);
        LockFactoryImpl lockFactory = new LockFactoryImpl();
        boolean response = lockFactory.deleteLock(lock);
        assert(!response);
    }

}
