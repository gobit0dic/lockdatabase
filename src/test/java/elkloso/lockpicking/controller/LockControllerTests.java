package elkloso.lockpicking.controller;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockService;
import elkloso.lockpicking.lockEntries.LockServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;

import static org.mockito.Mockito.mock;

@SpringBootTest
public class LockControllerTests {

    public LockController controller = new LockController();

    //TODO
    @Test
    public void getLockAttributes(){
        HttpEntity<LockAttributeDTO> lockAttribute = this.controller.getLockAttributes();
        assert(lockAttribute.getBody().toString().length() != 0);
    }

    @Test
    public void getAllLocks(){
        HttpEntity<LockDTO> locks = this.controller.getAllLocks();
        assert(locks.getBody().toString().length() != 0);
    }

    @Test
    public void getSingleLock(){
        HttpEntity<LockDTO> locks = this.controller.getSingleLock("Test");
        assert(locks.getBody().toString().length() != 0);
    }

    @Test
    public void writeLock(){
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        HttpEntity<LockDTO> locks = this.controller.writeLock(lock);
        assert(locks.getBody().toString().length() != 0);
    }

    @Test
    public void deleteLock(){
        boolean response = this.controller.deleteLock("Test");
        assert(response);
    }
}
