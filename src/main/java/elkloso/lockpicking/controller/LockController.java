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

    @GetMapping("/lock/{lockId}")
    public Lock getSingleLock(@PathVariable String lockId) {
        Lock lock = lockFactory.getSingleLock(lockId);
        return lock;
    }

    //TODO Return Value
    @PostMapping("/lock")
    public boolean writeLock(@RequestBody Lock lock) {
        lockFactory.writeLock(lock);
        return true;
    }
    @PostMapping("/lock/{lockId}/delete")
    public boolean deleteLock(@PathVariable String lockId) {
        Lock lock = new Lock(){};
        lock.setId(lockId);
        lockFactory.deleteLock(lock);
        return true;
    }
}
