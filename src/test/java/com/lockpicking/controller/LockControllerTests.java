package com.lockpicking.controller;

import com.lockpicking.lockAttribute.LockAttribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockControllerTests {

    public LockController controller = new LockController();

    //TODO
    @Test
    public void getLockAttributes(){
      LockAttribute lockAttribute = this.controller.getLockAttributes();
      assert(lockAttribute.getLockTypes().length != 0);
    }
}
