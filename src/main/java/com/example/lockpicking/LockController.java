package com.example.lockpicking;
import org.springframework.web.bind.annotation.*;

@RestController
public class LockController {

    @GetMapping("/lockattributes")
    public PossibleLockAttributes getLockAttributes() {
        PossibleLockAttributes lockAttributes = PossibleLockAttributes.getInstance();
        return lockAttributes;
    }

    /*@PostMapping("/lock")
    public Boolean writeLockRecord() {
        DTOPossibleLockAttributes lockAttributes = LockAttributes.getAllPossibleLockAttributes();
        return lockAttributes;
    }*/
}
