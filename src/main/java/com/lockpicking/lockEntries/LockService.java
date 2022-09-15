package com.lockpicking.lockEntries;

public class LockService implements LockServiceInterface{

    private final LockServiceInterface serviceInterface;

    private LockService(LockServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public boolean writeLock(Lock lockRecord){
        serviceInterface.writeLock(lockRecord);
        return true;
    };

}
