package elkloso.lockpicking;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockAttribute.LockAttributeFactory;
import elkloso.lockpicking.lockAttribute.LockAttributeServiceImpl;
import elkloso.lockpicking.persistence.LockAttributeRepository;

public class LockAttributeFactoryImpl extends LockAttributeFactory {

    public LockAttribute getLockAttributes(){
        LockAttributeServiceImpl lockAttributeServiceImpl = LockAttributeServiceImpl.getInstance(new LockAttributeRepository());
        return lockAttributeServiceImpl.getLockAttributes();
    }

}
