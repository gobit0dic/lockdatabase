package elkloso.lockpicking.controller;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockService;
import elkloso.lockpicking.lockEntries.LockServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;

@SpringBootTest
public class LockControllerTests {

    public LockController controller = new LockController();

    //TODO
    @Test
    public void getLockAttributes(){
      LockAttribute lockAttribute = this.controller.getLockAttributes();
      assert(lockAttribute.getLockTypes().length != 0);
    }

    @Test
    public void getAllLocks(){
        Lock[] locks = this.controller.getAllLocks();
        assert(locks.length == 0);
    }

    @Test
    public void getSingleLock(){
        Lock lock = this.controller.getSingleLock("Test");
        assert(lock == null);
    }

    @Test
    public void writeLock(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        boolean response = this.controller.writeLock(lock);
        assert(response);
    }

    @Test
    public void deleteLock(){
        boolean response = this.controller.deleteLock("Test");
        assert(response);
    }
}
