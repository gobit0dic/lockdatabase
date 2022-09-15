package com.lockpicking.lockEntries;

public class LockService implements LockServiceInterface{

    private final LockServiceInterface serviceInterface;

    private boolean checkForFilledRecord(Lock lock){
        if(lock.getUserId() == null || lock.getName() == null){
            return false;
        }
        return true;
    }

    public LockService(LockServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public boolean writeLock(Lock lockRecord){
        boolean wasSuccess = false;
        if(checkForFilledRecord(lockRecord)){
            wasSuccess = serviceInterface.writeLock(lockRecord);
        }
        return wasSuccess;
    };

}
