package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockServiceImpl;

public class LockFactoryImpl {

    public static boolean writeLock(Lock lock) {
        LockServiceImpl lockServiceImpl = new LockServiceImpl(new FacadeLockRepository());
        boolean returnValue = lockServiceImpl.writeLock(lock);
        return returnValue;
    }
}
