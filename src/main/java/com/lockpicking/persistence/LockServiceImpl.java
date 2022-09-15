package com.lockpicking.persistence;

import com.lockpicking.lockEntries.Lock;
import com.lockpicking.lockEntries.LockService;

public class LockServiceImpl{

    public static boolean writeLock(Lock lock) {
        LockService lockService = new LockService(new FacadeLockRepository());
        boolean returnValue = lockService.writeLock(lock);
        return returnValue;
    }
}
