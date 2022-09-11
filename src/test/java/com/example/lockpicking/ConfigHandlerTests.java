package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigHandlerTests {

    @Test
    public void getInstance(){
        ConfigHandler configHandler = ConfigHandler.getInstance();
        Config config = configHandler.config;
        assert(config.picks.length != 0);
        assert(config.wrenches.length != 0);
        assert(config.locks.length != 0);
        assert(config.pins.length != 0);
    }
}
