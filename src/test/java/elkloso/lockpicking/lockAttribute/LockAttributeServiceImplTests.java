package elkloso.lockpicking.lockAttribute;

import elkloso.lockpicking.LockAttributeFactoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeServiceImplTests {

    LockAttributeFactoryImpl lockAttributeFactory = new LockAttributeFactoryImpl();

    @Test
    public void getLockAttributes(){
        LockAttribute lockAttributes = lockAttributeFactory.getLockAttributes();
        assert(lockAttributes.getPinTypes().length != 0);
        assert(lockAttributes.getWrenchTypes().length != 0);
        assert(lockAttributes.getWrenchTypes().length != 0);
        assert(lockAttributes.getPickTypes().length != 0);
    }

}
