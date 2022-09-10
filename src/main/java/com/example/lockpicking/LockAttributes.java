package com.example.lockpicking;

public class LockAttributes {

    public static DTOPossibleLockAttributes getAllPossibleLockAttributes(){
        Lock lock = new Lock();
        DTOPossibleLockAttributes dto = new DTOPossibleLockAttributes();
        dto.WRENCHTYPES = lock.getWrenchTypes();
        dto.LOCKTYPES = lock.getLockTypes();
        dto.PICKTYPES = lock.getPickTypes();
        dto.PINTYPES = lock.getPinTypes();
        return dto;
    }

}
