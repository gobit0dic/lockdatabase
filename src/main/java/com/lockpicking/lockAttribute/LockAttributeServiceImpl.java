package com.lockpicking.lockAttribute;

public class LockAttributeServiceImpl{

    public static LockAttribute getLockAttributes(){
        LockAttributeService lockAttributeService = LockAttributeService.getInstance(new LockAttributeRespository());
        LockAttribute lockAttribute = lockAttributeService.getLockAttributes();
        return lockAttribute;
    }

}
