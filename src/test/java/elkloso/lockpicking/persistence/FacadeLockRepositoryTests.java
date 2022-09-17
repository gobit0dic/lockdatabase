package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FacadeLockRepositoryTests {

    @Test
    public void writeLockValid(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        Lock lockReturn = facadeLockRepository.writeLock(lock);
        assert(lockReturn.getId() == null);
    }

    @Test
    public void getAllLocks(){
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        Lock[] locks = facadeLockRepository.getAllLocks();
    }

    @Test
    public void getSingleLock(){
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        Lock lock = facadeLockRepository.getSingleLock("Test");
    }

    @Test
    public void deleteLock(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        boolean isSucces = facadeLockRepository.deleteLock(lock);
    }

}
