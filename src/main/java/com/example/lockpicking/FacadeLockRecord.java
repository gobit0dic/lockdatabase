package com.example.lockpicking;

public class FacadeLockRecord {

    public boolean createRecord(DTOLockRecord lockRecord){
        LockRecordHandler handler = new LockRecordHandler();
        handler.createFileIfNotExists();
        String dtoString = handler.dtoToString(lockRecord);
        handler.writeRecord(dtoString);
        return true;
    }
}
