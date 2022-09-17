package elkloso.lockpicking.lockEntries;

public interface LockService {
    Lock[] getAllLocks();
    Lock writeLock(Lock lock);
    boolean deleteLock(Lock lock);
    Lock getSingleLock(String lockId);
}
