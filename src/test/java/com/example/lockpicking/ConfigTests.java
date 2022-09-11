package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigTests {

    @Test
    public void tests(){
        Config config = new Config();
        config.picks = new String[]{};
        config.wrenches = new String[]{};
        config.locks = new String[]{};
        config.pins = new String[]{};
    }

}
