package elkloso.lockpicking.lockEntries;

import org.springframework.util.DigestUtils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LockServiceImpl implements LockService {

    private final LockService serviceInterface;

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

    public LockServiceImpl(LockService serviceInterface) {
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

    public boolean deleteLock(Lock lockRecord){
        return serviceInterface.deleteLock(lockRecord);
    };

    public Lock[] getAllLocks(){
        return serviceInterface.getAllLocks();
    }

    public Lock getSingleLock(String lockId){
        return serviceInterface.getSingleLock(lockId);
    }

}
