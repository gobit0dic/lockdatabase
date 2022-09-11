package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LinksTests {

    @Test
    public void DTOLockRecord(){
        Links links = new Links();
        links.selfhref = "TestURL";
        links.lockhref = "TesterURL";
    }

}
