package com.lockpicking.lockEntries;

public class LockServiceImpl{

    public static boolean writeLock(Lock lock) {
        LockService lockService = new LockService(new FacadeLockRepository());
        boolean returnValue = lockService.writeLock(lock);
        return returnValue;
    }
}
