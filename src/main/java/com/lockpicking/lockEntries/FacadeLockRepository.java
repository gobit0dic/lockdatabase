package com.lockpicking.lockEntries;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FacadeLockRepository implements LockServiceInterface{

    public boolean writeLock(Lock lockRecord){
        try{
            LockRepository lockRepository = new LockRepository();
            lockRepository.setUserId(lockRecord);
            lockRepository.setFilename();
            lockRepository.createFileIfNotExists();
            lockRepository.writeLock(lockRecord);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
