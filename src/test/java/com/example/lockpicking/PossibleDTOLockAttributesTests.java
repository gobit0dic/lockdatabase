package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PossibleDTOLockAttributesTests {

    @Test
    public void positiveTest(){
        PossibleLockAttributes dto = PossibleLockAttributes.getInstance();
        assert(dto.PINTYPES.length != 0);
        assert(dto.LOCKTYPES.length != 0);
        assert(dto.WRENCHTYPES.length != 0);
        assert(dto.PICKTYPES.length != 0);
    }
}
