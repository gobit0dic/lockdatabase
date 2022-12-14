package elkloso.lockpicking.lockAttribute;

public class LockAttributeServiceImpl implements LockAttributeService {
    private final LockAttributeService lockAttributeService;

    private static LockAttributeServiceImpl lockAttributeServiceImpl;

    private LockAttributeServiceImpl(LockAttributeService lockAttributeService) {
        this.lockAttributeService = lockAttributeService;
    }

    @Override
    public LockAttribute getLockAttributes(){
        LockAttribute lockAttribute = lockAttributeService.getLockAttributes();
        return lockAttribute;
    }

    public static LockAttributeServiceImpl getInstance(LockAttributeService lockAttributeService){
        if (null == lockAttributeServiceImpl) {
            lockAttributeServiceImpl = new LockAttributeServiceImpl(lockAttributeService);
        }
        return lockAttributeServiceImpl;
    }

}
