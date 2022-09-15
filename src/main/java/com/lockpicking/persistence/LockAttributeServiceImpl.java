package com.lockpicking.persistence;

import com.lockpicking.lockAttribute.LockAttribute;
import com.lockpicking.lockAttribute.LockAttributeService;

public class LockAttributeServiceImpl{

    public static LockAttribute getLockAttributes(){
        LockAttributeService lockAttributeService = LockAttributeService.getInstance(new LockAttributeRespository());
        LockAttribute lockAttribute = lockAttributeService.getLockAttributes();
        return lockAttribute;
    }

}
