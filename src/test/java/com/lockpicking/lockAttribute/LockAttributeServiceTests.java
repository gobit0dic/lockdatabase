package com.lockpicking.lockAttribute;

import com.lockpicking.persistence.LockAttributeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeServiceTests {

    @Test
    public void getLockAttributes(){
        LockAttribute lockAttributes = LockAttributeServiceImpl.getLockAttributes();
        assert(lockAttributes.getPinTypes().length != 0);
        assert(lockAttributes.getWrenchTypes().length != 0);
        assert(lockAttributes.getWrenchTypes().length != 0);
        assert(lockAttributes.getPickTypes().length != 0);
    }

}
