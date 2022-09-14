package com.lockpicking.lockAttribute;

import com.lockpicking.lockAttribute.LockAttributeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeServiceTests {

    @Test
    public void getInstance(){
        LockAttributeService lockAttributes = LockAttributeService.getInstance();
        assert(lockAttributes.PINTYPES.length != 0);
        assert(lockAttributes.LOCKTYPES.length != 0);
        assert(lockAttributes.WRENCHTYPES.length != 0);
        assert(lockAttributes.PICKTYPES.length != 0);
    }

    @Test
    public void getWrenchTypes(){
        LockAttributeService lockAttributes = LockAttributeService.getInstance();
        String[] wrenchTypes = lockAttributes.getWrenchTypes();
        assert(wrenchTypes.length != 0);
    }

    @Test
    public void getPickTypes(){
        LockAttributeService lockAttributes = LockAttributeService.getInstance();
        String[] pickTypes = lockAttributes.getPickTypes();
        assert(pickTypes.length != 0);
    }

    @Test
    public void getLockTypes(){
        LockAttributeService lockAttributes = LockAttributeService.getInstance();
        String[] lockTypes = lockAttributes.getLockTypes();
        assert(lockTypes.length != 0);
    }

    @Test
    public void getPintypes(){
        LockAttributeService lockAttributes = LockAttributeService.getInstance();
        String[] pinTypes = lockAttributes.getPinTypes();
        assert(pinTypes.length != 0);
    }
}
