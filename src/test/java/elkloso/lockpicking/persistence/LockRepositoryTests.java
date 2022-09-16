package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockRepositoryTests {

    @Test
    public void writeLockValid(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        LockRepository lockRepository  = new LockRepository();
        lockRepository.setUserId("Test");
        lockRepository.setFilename();
        boolean isSucces = lockRepository.writeLock(lock);
        assert(isSucces);
    }

    @Test
    public void getAllLocks(){
        LockRepository lockRepository  = new LockRepository();
        lockRepository.setUserId("Test");
        lockRepository.setFilename();
        Lock[] locks = lockRepository.getAllLocks();
    }

    @Test
    public void getSingleLock(){
        LockRepository lockRepository  = new LockRepository();
        lockRepository.setUserId("Test");
        lockRepository.setFilename();
        Lock lock = lockRepository.getSingleLock("Test");
    }

    @Test
    public void deleteLockFromArray(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        LockRepository lockRepository  = new LockRepository();
        lockRepository.setUserId("Test");
        lockRepository.setFilename();
        lockRepository.deleteLockFromArray(lock);
    }

    @Test
    public void writeLocks(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        Lock[] locks = new Lock[]{lock};
        LockRepository lockRepository  = new LockRepository();
        lockRepository.setUserId("Test");
        lockRepository.setFilename();
        boolean isSucces = lockRepository.writeLocks(locks);
        assert(isSucces);
    }
}
