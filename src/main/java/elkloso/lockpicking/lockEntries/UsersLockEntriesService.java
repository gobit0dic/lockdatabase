package elkloso.lockpicking.lockEntries;

public class UsersLockEntriesService {

    private static UsersLockEntriesService instance;
    private LockEntries usersLockEntries;


    UsersLockEntriesService(){
    }

    private void setLocksToCache(Lock[] locks){
        usersLockEntries.setAllLocks(locks);
    }

    public UsersLockEntriesService getInstance(){
        if(instance == null){
            instance = new UsersLockEntriesService();
        }
        return instance;
    }
}
