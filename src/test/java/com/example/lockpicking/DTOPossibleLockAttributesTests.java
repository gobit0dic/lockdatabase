package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DTOPossibleLockAttributesTests {

    @Test
    public void positiveTest(){
        DTOPossibleLockAttributes dto = new DTOPossibleLockAttributes();
        dto.LOCKTYPES = new String[]{"Test1", "Test2"};
        dto.WRENCHTYPES = new String[]{"Test1", "Test2"};
        dto.PICKTYPES = new String[]{"Test1", "Test2"};
        dto.PINTYPES = new String[]{"Test1", "Test2"};

        for(Integer i = 0; i <= 1; i++){
            assert(dto.LOCKTYPES[i].contains("Test" + String.valueOf(i+1)));
            assert(dto.WRENCHTYPES[i].contains("Test" + String.valueOf(i+1)));
            assert(dto.PICKTYPES[i].contains("Test" + String.valueOf(i+1)));
            assert(dto.PINTYPES[i].contains("Test" + String.valueOf(i+1)));
        }
    }
}
