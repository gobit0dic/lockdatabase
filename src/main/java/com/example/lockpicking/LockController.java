package com.example.lockpicking;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LockController {

    @GetMapping("/lockattributes")
    public DTOPossibleLockAttributes getLockAttributes(
    ) {
        DTOPossibleLockAttributes lockAttributes = LockAttributes.getAllPossibleLockAttributes();
        return lockAttributes;
    }
}
