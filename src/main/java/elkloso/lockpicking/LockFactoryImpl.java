package elkloso.lockpicking;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockFactory;
import elkloso.lockpicking.lockEntries.LockServiceImpl;
import elkloso.lockpicking.persistence.FacadeLockRepository;

public class LockFactoryImpl extends LockFactory {

    public boolean writeLock(Lock lock) {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        return lockServiceImpl.writeLock(lock);
    }

    public boolean deleteLock(Lock lock) {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        return lockServiceImpl.deleteLock(lock);
    }

    public Lock[] getAllLocks() {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        return lockServiceImpl.getAllLocks();
    }

    public Lock getSingleLock(String lockId){
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        return lockServiceImpl.getSingleLock(lockId);
    }
}
