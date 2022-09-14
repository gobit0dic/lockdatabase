package com.lockpicking.controller;
import com.lockpicking.lockAttribute.LockAttribute;
import com.lockpicking.lockAttribute.LockAttributeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
public class LockController {

    //TODO RESTful
    @GetMapping("/lockattributes")
    public LockAttribute getLockAttributes() {
        LockAttribute lockAttributes = LockAttributeServiceImpl.getLockAttributes();
        return lockAttributes;
    }

    /*@PostMapping("/lock")
    public Boolean writeLockRecord() {
        DTOPossibleLockAttributes lockAttributes = LockAttributes.getAllPossibleLockAttributes();
        return lockAttributes;
    }*/
}
