package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockControllerTests {

    public LockController controller = new LockController();

    @Test
    public void getLockAttributes(){
      DTOPossibleLockAttributes dto = this.controller.getLockAttributes();
      assert(dto.PICKTYPES.length != 0);
    }
}
