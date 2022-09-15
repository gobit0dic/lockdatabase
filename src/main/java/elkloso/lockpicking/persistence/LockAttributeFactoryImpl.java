package elkloso.lockpicking.persistence;

import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockAttribute.LockAttributeFactory;
import elkloso.lockpicking.lockAttribute.LockAttributeServiceImpl;

public class LockAttributeFactoryImpl extends LockAttributeFactory {

    public LockAttribute getLockAttributes(){
        LockAttributeServiceImpl lockAttributeServiceImpl = LockAttributeServiceImpl.getInstance(new LockAttributeRespository());
        LockAttribute lockAttribute = lockAttributeServiceImpl.getLockAttributes();
        return lockAttribute;
    }

}
