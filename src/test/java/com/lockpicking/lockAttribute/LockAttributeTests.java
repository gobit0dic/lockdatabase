package com.lockpicking.lockAttribute;

import com.lockpicking.lockAttribute.LockAttribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeTests {

    @Test
    public void tests(){
        LockAttribute lockAttribute = new LockAttribute();
        lockAttribute.picks = new String[]{};
        lockAttribute.wrenches = new String[]{};
        lockAttribute.locks = new String[]{};
        lockAttribute.pins = new String[]{};
    }

}
