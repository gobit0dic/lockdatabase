package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockService;

public class FacadeLockRepository implements LockService {

    private static final String userId = "1"; //TODO UserHandling later

    public boolean writeLock(Lock lockRecord){
        try{
            LockRepository lockRepository = new LockRepository();
            lockRepository.setUserId(lockRecord.getUserId());
            lockRepository.setFilename();
            lockRepository.createFileIfNotExists();
            lockRepository.writeLock(lockRecord);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Lock[] getAllLocks() {
        try{
            LockRepository lockRepository = new LockRepository();
            lockRepository.setUserId(userId);
            lockRepository.setFilename();
            lockRepository.createFileIfNotExists();
            return lockRepository.getAllLocks();
        }catch (Exception e){
            return null;
        }
    }
}
