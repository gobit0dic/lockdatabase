package elkloso.lockpicking.lockAttribute;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class LockAttributeServiceImplTests {
    @Test
    public void getLockAttributesValid() {
        LockAttribute lockAttribute = new LockAttribute();
        String[] pinTypeSet = {"TestPinType"};
        String[] lockTypeSet = {"TestLockType"};
        String[] pickTypeSet = {"TestPickType"};
        String[] wrenchTypeSet = {"TestWrenchType"};
        lockAttribute.setPinTypes(pinTypeSet);
        lockAttribute.setLockTypes(lockTypeSet);
        lockAttribute.setWrenchTypes(wrenchTypeSet);
        lockAttribute.setPickTypes(pickTypeSet);

        LockAttributeService serviceInterface = mock(LockAttributeService.class);
        LockAttributeServiceImpl lockAttributeService = LockAttributeServiceImpl.getInstance(serviceInterface);
        when(serviceInterface.getLockAttributes())
                .thenReturn(lockAttribute);
        LockAttribute lockAttributes = lockAttributeService.getLockAttributes();
        assert(lockAttributes.getPinTypes()[0].equals(pinTypeSet[0]));
        assert(lockAttributes.getLockTypes()[0].equals(lockTypeSet[0]));
        assert(lockAttributes.getWrenchTypes()[0].equals(wrenchTypeSet[0]));
        assert(lockAttributes.getPickTypes()[0].equals(pickTypeSet[0]));
    }

    @Test
    public void getLockAttributesInvalid() {
        LockAttribute lockAttribute = new LockAttribute();
        LockAttributeService serviceInterface = mock(LockAttributeService.class);
        LockAttributeServiceImpl lockAttributeService = LockAttributeServiceImpl.getInstance(serviceInterface);
        when(serviceInterface.getLockAttributes())
                .thenReturn(lockAttribute);
        LockAttribute lockAttributes = lockAttributeService.getLockAttributes();
        System.out.println(lockAttributes.getPinTypes());
        assert(lockAttributes.getPinTypes() == null);
        assert(lockAttributes.getLockTypes() == null);
        assert(lockAttributes.getWrenchTypes() == null);
        assert(lockAttributes.getPickTypes() == null);
    }
}
