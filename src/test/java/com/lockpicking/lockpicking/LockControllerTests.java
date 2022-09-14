package com.lockpicking.lockpicking;

import com.lockpicking.controller.LockController;
import com.lockpicking.lockAttribute.LockAttributeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockControllerTests {

    public LockController controller = new LockController();

    @Test
    public void getLockAttributes(){
      LockAttributeService dto = this.controller.getLockAttributes();
      assert(dto.PICKTYPES.length != 0);
    }
}
