package com.lockpicking.lockEntries;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FacadeLockRecord {

    public boolean createRecord(DTOLockRecord lockRecord, String fileName){
        try{
            LockRecordHandler handler = new LockRecordHandler();
            ObjectMapper objectMapper = new ObjectMapper();
            boolean hasValues = handler.checkRecordForValues(lockRecord);
            if(!hasValues){
                return false;
            }
            handler.setFilename(fileName);
            handler.createFileIfNotExists();
            String dtoString = objectMapper.writeValueAsString(lockRecord);
            handler.writeRecord(dtoString);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
