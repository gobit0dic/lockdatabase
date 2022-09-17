package elkloso.lockpicking;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeFactoryImplTests {
    @Test
    public void getLockAttributes(){
        LockAttributeFactoryImpl lockAttributeFactory = new LockAttributeFactoryImpl();
        LockAttribute lockAttributes = lockAttributeFactory.getLockAttributes();
        assert(lockAttributes.getPinTypes() != null);
        assert(lockAttributes.getLockTypes() != null);
        assert(lockAttributes.getWrenchTypes() != null);
        assert(lockAttributes.getPickTypes() != null);
    }
}
