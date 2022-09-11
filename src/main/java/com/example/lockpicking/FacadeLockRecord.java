package com.example.lockpicking;

public class FacadeLockRecord {

    public boolean createRecord(DTOLockRecord lockRecord){
        LockRecordHandler handler = new LockRecordHandler();
        handler.setFilename("Test.json");
        handler.createFileIfNotExists();
        String dtoString = lockRecord.toString();
        handler.writeRecord(dtoString);
        return true;
    }
}
