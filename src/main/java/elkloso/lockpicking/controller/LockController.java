package elkloso.lockpicking.controller;
import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.persistence.LockAttributeFactoryImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class LockController {

    //TODO RESTful
    @GetMapping("/lockattributes")
    public LockAttribute getLockAttributes() {
        LockAttributeFactoryImpl lockAttributeFactory = new LockAttributeFactoryImpl();
        LockAttribute lockAttributes = lockAttributeFactory.getLockAttributes();
        return lockAttributes;
    }

    /*@PostMapping("/lock")
    public Boolean writeLockRecord() {
        DTOPossibleLockAttributes lockAttributes = LockAttributes.getAllPossibleLockAttributes();
        return lockAttributes;
    }*/
}
