package com.lockpicking.lockEntries;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.util.DigestUtils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LockService implements LockServiceInterface{

    private final LockServiceInterface serviceInterface;

    private boolean checkForFilledRecord(Lock lock){
        if(lock.getUserId() == null || lock.getName() == null){
            return false;
        }
        return true;
    }

    private String calculateLockId(Lock lock){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String inputString = lock.getName() + String.valueOf(ts);
        String lockId = DigestUtils.md5DigestAsHex(inputString.getBytes());
        return lockId;
    }

    public LockService(LockServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public boolean writeLock(Lock lockRecord){
        lockRecord.setDateTime(String.valueOf(LocalDateTime.now()));
        String lockId = calculateLockId(lockRecord);
        lockRecord.setId(lockId);
        boolean wasSuccess = false;
        if(checkForFilledRecord(lockRecord)){
            wasSuccess = serviceInterface.writeLock(lockRecord);
        }
        return wasSuccess;
    };

}
