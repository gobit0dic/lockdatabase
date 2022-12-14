package elkloso.lockpicking.lockEntries;

abstract public class LockFactory {
    abstract public Lock writeLock(Lock lock);
    abstract public boolean deleteLock(Lock lock);
    abstract public Lock[] getAllLocks();
    abstract public Lock getSingleLock(String lockId);
}
