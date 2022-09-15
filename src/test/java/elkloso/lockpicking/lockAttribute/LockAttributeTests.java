package elkloso.lockpicking.lockAttribute;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LockAttributeTests {

    @Test
    public void getSetLock(){
        String[] str = new String[]{"TestName"};
        LockAttribute lockAttribute = new LockAttribute();
        lockAttribute.setLockTypes(str);
        String[] returnStr = lockAttribute.getLockTypes();
        assert(returnStr == str);
    }

    @Test
    public void getSetPins(){
        String[] str = new String[]{"TestName"};
        LockAttribute lockAttribute = new LockAttribute();
        lockAttribute.setPinTypes(str);
        String[] returnStr = lockAttribute.getPinTypes();
        assert(returnStr == str);
    }

    @Test
    public void getSetWrench(){
        String[] str = new String[]{"TestName"};
        LockAttribute lockAttribute = new LockAttribute();
        lockAttribute.setWrenchTypes(str);
        String[] returnStr = lockAttribute.getWrenchTypes();
        assert(returnStr == str);
    }

    @Test
    public void getSetPick(){
        String[] str = new String[]{"TestName"};
        LockAttribute lockAttribute = new LockAttribute();
        lockAttribute.setPickTypes(str);
        String[] returnStr = lockAttribute.getPickTypes();
        assert(returnStr == str);
    }

}
