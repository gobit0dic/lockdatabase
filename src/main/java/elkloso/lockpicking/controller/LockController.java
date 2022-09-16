package elkloso.lockpicking.controller;
import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.LockAttributeFactoryImpl;
import elkloso.lockpicking.LockFactoryImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class LockController {

    LockAttributeFactoryImpl lockAttributeFactory = new LockAttributeFactoryImpl();
    LockFactoryImpl lockFactory = new LockFactoryImpl();

    //TODO RESTful
    @GetMapping("/lockattributes")
    public LockAttribute getLockAttributes() {
        LockAttribute lockAttributes = lockAttributeFactory.getLockAttributes();
        return lockAttributes;
    }

    @GetMapping("/locks")
    public Lock[] getAllLocks() {
        Lock[] locks = lockFactory.getAllLocks();
        return locks;
    }

    @PostMapping("/lock")
    public boolean writeLock() {
        //TODO
        return true;
    }
}
