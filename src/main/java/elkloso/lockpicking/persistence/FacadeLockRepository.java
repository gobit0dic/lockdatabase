package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockServiceInterface;

public class FacadeLockRepository implements LockServiceInterface {

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
