package com.lockpicking.lockAttribute;

public class LockAttributeService implements LockAttributeServiceInterface {
    private final LockAttributeServiceInterface lockAttributeServiceInterface;
    private static LockAttribute lockAttribute;

    private static LockAttributeService lockAttributeService;

    private LockAttributeService(LockAttributeServiceInterface lockAttributeServiceInterface) {
        this.lockAttributeServiceInterface = lockAttributeServiceInterface;
    }

    @Override
    public LockAttribute getLockAttributes(){
        lockAttribute = lockAttributeServiceInterface.getLockAttributes();
        return lockAttribute;
    }

    public static LockAttributeService getInstance(LockAttributeServiceInterface lockAttributeServiceInterface){
        if (null == lockAttributeService) {
            lockAttributeService = new LockAttributeService(lockAttributeServiceInterface);
        }
        return lockAttributeService;
    }

}
