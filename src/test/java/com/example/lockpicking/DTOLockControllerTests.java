package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DTOLockControllerTests {

    public LockController controller = new LockController();

    @Test
    public void getLockAttributes(){
      PossibleLockAttributes dto = this.controller.getLockAttributes();
      assert(dto.PICKTYPES.length != 0);
    }
}
