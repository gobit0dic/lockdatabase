package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeRepositoryTests {

    @Test
    public void getLockAttributes(){
        LockAttributeRespository lockAttributeRespository = new LockAttributeRespository();
        LockAttribute lockAttribute = lockAttributeRespository.getLockAttributes();
        assert(lockAttribute != null);
    }
}
