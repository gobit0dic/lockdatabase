package elkloso.lockpicking.lockEntries;

import elkloso.lockpicking.lockAttribute.LockAttribute;

abstract public class LockFactory {
    abstract public boolean writeLock(Lock lock);
    abstract public Lock[] getAllLocks();
}
