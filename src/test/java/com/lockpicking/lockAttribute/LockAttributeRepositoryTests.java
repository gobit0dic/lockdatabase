package com.lockpicking.lockAttribute;

import com.lockpicking.lockAttribute.LockAttribute;
import com.lockpicking.lockAttribute.LockAttributeRespository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeRepositoryTests {

    @Test
    public void getLockAttributes(){
        LockAttributeRespository lockAttributeRespository = new LockAttributeRespository();
        LockAttribute lockAttribute = lockAttributeRespository.getLockAttributes();
        assert(lockAttribute.getPickTypes().length != 0);
        assert(lockAttribute.getWrenchTypes().length != 0);
        assert(lockAttribute.getLockTypes().length != 0);
        assert(lockAttribute.getPinTypes().length != 0);
    }
}