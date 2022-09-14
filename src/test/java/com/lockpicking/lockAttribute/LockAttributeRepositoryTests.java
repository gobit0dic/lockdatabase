package com.lockpicking.lockAttribute;

import com.lockpicking.lockAttribute.LockAttribute;
import com.lockpicking.lockAttribute.LockAttributeRespository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeRepositoryTests {

    @Test
    public void getInstance(){
        LockAttributeRespository lockAttributeRespository = new LockAttributeRespository();
        LockAttribute lockAttribute = lockAttributeRespository.getLockAttributes();
        assert(lockAttribute.picks.length != 0);
        assert(lockAttribute.wrenches.length != 0);
        assert(lockAttribute.locks.length != 0);
        assert(lockAttribute.pins.length != 0);
    }
}
