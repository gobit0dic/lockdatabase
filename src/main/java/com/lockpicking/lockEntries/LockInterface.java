package com.lockpicking.lockEntries;

public interface LockInterface {
    public Lock[] getAllLocks();

    public Lock writeLock();

    public Lock deleteLock();
}
