package elkloso.lockpicking.lockEntries;

public interface LockService {
    Lock[] getAllLocks();
    boolean writeLock(Lock lock);
    boolean deleteLock(Lock lock);
    Lock getSingleLock(String lockId);
}
