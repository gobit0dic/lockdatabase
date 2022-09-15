package com.lockpicking.lockEntries;

public class LockServiceImpl implements LockServiceInterface{

    @Override
    public boolean writeLock(Lock lock) {
        boolean returnValue = FacadeLockRepository.createRecord(lock);
        return returnValue;
    }
}
