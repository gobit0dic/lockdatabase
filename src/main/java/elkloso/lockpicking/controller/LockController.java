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
        return lockAttributeFactory.getLockAttributes();
    }

    @GetMapping("/locks")
    public Lock[] getAllLocks() {
        return lockFactory.getAllLocks();
    }

    @GetMapping("/lock/{lockId}")
    public Lock getSingleLock(@PathVariable String lockId) {
        return lockFactory.getSingleLock(lockId);
    }

    @PostMapping("/lock")
    public boolean writeLock(@RequestBody Lock lock) {
        return lockFactory.writeLock(lock);
    }

    //TODO Delete just a part
    @PostMapping("/lock/{lockId}/delete")
    public boolean deleteLock(@PathVariable String lockId) {
        Lock lock = new Lock(){};
        lock.setId(lockId);
        lockFactory.deleteLock(lock);
        return true;
    }
}
