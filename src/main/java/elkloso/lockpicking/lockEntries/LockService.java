package elkloso.lockpicking.lockEntries;

public interface LockService {
    public Lock[] getAllLocks();
    public boolean writeLock(Lock lock);

    public Lock getSingleLock(String lockId);
    //public boolean deleteLock(Lock lock);
}
