package elkloso.lockpicking.lockEntries;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class LockServiceImplTests {

    @Test
    public void getAllLocksNoLock() {
        LockService serviceInterface = mock(LockService.class);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock[] locks = lockService.getAllLocks();
        assert(locks == null);
    }

    @Test
    public void getAllLocksWithLock() {
        Lock lock = new Lock();
        lock.setId("Test");
        Lock[] locks = new Lock[]{lock};
        LockService serviceInterface = mock(LockService.class);
        when(serviceInterface.getAllLocks())
                .thenReturn(locks);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock[] locksReturn = lockService.getAllLocks();
        assert(locksReturn.length == 1);
    }

    @Test
    public void getSingleLockWithLock() {
        Lock lock = new Lock();
        lock.setId("Test");
        LockService serviceInterface = mock(LockService.class);
        when(serviceInterface.getSingleLock("123"))
                .thenReturn(lock);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock lockReturn = lockService.getSingleLock("123");
        assert(lockReturn.getId().equals("Test"));
    }

    @Test
    public void getSingleLockNoLock() {
        LockService serviceInterface = mock(LockService.class);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock lock = lockService.getSingleLock("123");
        assert(lock == null);
    }

    @Test
    public void writeLockValid() {
        Lock lock = new Lock();
        String id = "Test";
        lock.setUserId(id);
        lock.setName("TestName");
        LockService serviceInterface = mock(LockService.class);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock lockReturn = lockService.writeLock(lock);
        assert(lockReturn == null);
    }

    @Test
    public void writeLockNotValid() {
        Lock lock = new Lock();
        String id = "Test";
        lock.setId(id);
        LockService serviceInterface = mock(LockService.class);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        Lock lockReturn = lockService.writeLock(lock);
        assert(lockReturn == null);
    }

    @Test
    public void deleteLockNoLock() {
        Lock lock = new Lock();
        String id = "Test";
        lock.setId(id);
        LockService serviceInterface = mock(LockService.class);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        boolean response = lockService.deleteLock(lock);
        assert(!response);
    }

    @Test
    public void deleteLockWithLock() {
        Lock lock = new Lock();
        String id = "Test";
        lock.setId(id);
        LockService serviceInterface = mock(LockService.class);
        when(serviceInterface.deleteLock(lock))
                .thenReturn(true);
        LockServiceImpl lockService = new LockServiceImpl(serviceInterface);
        boolean response = lockService.deleteLock(lock);
        assert(response);
    }
}
