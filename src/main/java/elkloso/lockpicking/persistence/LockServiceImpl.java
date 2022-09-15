package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockService;

public class LockServiceImpl{

    public static boolean writeLock(Lock lock) {
        LockService lockService = new LockService(new FacadeLockRepository());
        boolean returnValue = lockService.writeLock(lock);
        return returnValue;
    }
}
