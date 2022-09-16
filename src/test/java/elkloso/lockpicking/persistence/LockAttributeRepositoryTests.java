package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeRepositoryTests {

    @Test
    public void getLockAttributes(){
        LockAttributeRepository lockAttributeRepository = new LockAttributeRepository();
        LockAttribute lockAttribute = lockAttributeRepository.getLockAttributes();
        assert(lockAttribute.getPickTypes().length != 0);
        assert(lockAttribute.getWrenchTypes().length != 0);
        assert(lockAttribute.getLockTypes().length != 0);
        assert(lockAttribute.getPinTypes().length != 0);
    }
}
