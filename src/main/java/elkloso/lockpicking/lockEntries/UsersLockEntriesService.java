package elkloso.lockpicking.lockEntries;

public class UsersLockEntriesService {

    private static UsersLockEntriesService instance;
    private LockEntries usersLockEntries;


    UsersLockEntriesService(){

    }

    public UsersLockEntriesService getInstance(){
        if(instance == null){
            instance = new UsersLockEntriesService();
        }
        return instance;
    }
}
