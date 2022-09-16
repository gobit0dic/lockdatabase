package elkloso.lockpicking;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockFactory;
import elkloso.lockpicking.lockEntries.LockServiceImpl;
import elkloso.lockpicking.persistence.FacadeLockRepository;

public class LockFactoryImpl extends LockFactory {

    public boolean writeLock(Lock lock) {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        boolean returnValue = lockServiceImpl.writeLock(lock);
        return returnValue;
    }

    public Lock[] getAllLocks() {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        Lock[] locks = lockServiceImpl.getAllLocks();
        return locks;
    }

    public Lock getSingleLock(String lockId){
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        Lock lock = lockServiceImpl.getSingleLock(lockId);
        return lock;
    }
}
