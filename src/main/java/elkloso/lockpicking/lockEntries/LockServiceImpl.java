package elkloso.lockpicking.lockEntries;

import org.springframework.util.DigestUtils;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LockServiceImpl implements LockService {

    private final LockService serviceInterface;

    private boolean checkForFilledRecord(Lock lock){
        return lock.getUserId() != null && lock.getName() != null;
    }

    private String calculateLockId(Lock lock){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        String inputString = lock.getName() + ts;
        return DigestUtils.md5DigestAsHex(inputString.getBytes());
    }

    public LockServiceImpl(LockService serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    public Lock writeLock(Lock lockRecord){
        lockRecord.setDateTime(String.valueOf(LocalDateTime.now()));
        String lockId = calculateLockId(lockRecord);
        lockRecord.setId(lockId);
        lockRecord.setUserId("1");
        if(checkForFilledRecord(lockRecord)){
            return serviceInterface.writeLock(lockRecord);
        }
        return null;
    }

    public boolean deleteLock(Lock lockRecord){
        return serviceInterface.deleteLock(lockRecord);
    }

    public Lock[] getAllLocks(){
        return serviceInterface.getAllLocks();
    }

    public Lock getSingleLock(String lockId){
        return serviceInterface.getSingleLock(lockId);
    }

}
