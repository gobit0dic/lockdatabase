package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PossibleLockAttributesTests {

    @Test
    public void getInstance(){
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        assert(lockAttributes.PINTYPES.length != 0);
        assert(lockAttributes.LOCKTYPES.length != 0);
        assert(lockAttributes.WRENCHTYPES.length != 0);
        assert(lockAttributes.PICKTYPES.length != 0);
    }

    @Test
    public void getWrenchTypes(){
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        String[] wrenchTypes = lockAttributes.getWrenchTypes();
        assert(wrenchTypes.length != 0);
    }

    @Test
    public void getPickTypes(){
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        String[] pickTypes = lockAttributes.getPickTypes();
        assert(pickTypes.length != 0);
    }

    @Test
    public void getLockTypes(){
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        String[] lockTypes = lockAttributes.getLockTypes();
        assert(lockTypes.length != 0);
    }

    @Test
    public void getPintypes(){
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        String[] pinTypes = lockAttributes.getPinTypes();
        assert(pinTypes.length != 0);
    }
}
