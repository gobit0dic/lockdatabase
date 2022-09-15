package com.lockpicking.lockEntries;

public class LockEntries {

    private Lock[] allLocks;
    private String userId;

    public Lock[] getAllLocks(){
        return this.allLocks;
    }

    public void setAllLocks(Lock[] allLocks){
        this.allLocks = allLocks;
    }

    public String getUserId(){
        return this.userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

}
