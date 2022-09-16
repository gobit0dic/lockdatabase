package elkloso.lockpicking.lockEntries;

import elkloso.lockpicking.LockFactoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootTest
public class FacadeLockRepositoryTests {

    @Test
    public void createRecordPositive(){
        Lock lock = new Lock();
        lock.setName("Test");
        lock.setUserId("1");

        LockFactoryImpl lockFactory = new LockFactoryImpl();
        boolean wasSuccess = lockFactory.writeLock(lock);
        assert(wasSuccess);

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
    public void createRecordEmptyRecord(){
        Lock lock = new Lock();
        LockFactoryImpl lockFactory = new LockFactoryImpl();
        boolean wasSuccess = lockFactory.writeLock(lock);
        assert(!wasSuccess);

        String path = System.getProperty("user.dir") + "/mockDatabase/locks/null.json";

        File file = new File(path);
        assert(!file.exists());
    }

}
