package com.lockpicking.lockEntries;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FacadeLockRepository {

    public static boolean createRecord(Lock lockRecord){
        try{
            LockRepository lockRepository = new LockRepository();
            lockRepository.setFilename(fileName);
            lockRepository.createFileIfNotExists();
            lockRepository.writeLock(lockRecord);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
