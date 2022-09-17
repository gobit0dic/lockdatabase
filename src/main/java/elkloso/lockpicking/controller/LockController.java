package elkloso.lockpicking.controller;
import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.LockAttributeFactoryImpl;
import elkloso.lockpicking.LockFactoryImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class LockController {

    LockAttributeFactoryImpl lockAttributeFactory = new LockAttributeFactoryImpl();
    LockFactoryImpl lockFactory = new LockFactoryImpl();

    @GetMapping("/lockattributes")
    public HttpEntity<LockAttributeDTO> getLockAttributes() {
        LockAttributeDTO lockAttributeDTO = new LockAttributeDTO(lockAttributeFactory.getLockAttributes());
        lockAttributeDTO.add(linkTo(methodOn(LockController.class).getLockAttributes()).withSelfRel());
        return new ResponseEntity<>(lockAttributeDTO, HttpStatus.OK);
    }

    @GetMapping("/locks")
    public HttpEntity<LockDTO> getAllLocks() {
        LockDTO lockDTO = new LockDTO(lockFactory.getAllLocks());
        lockDTO.add(linkTo(methodOn(LockController.class).getAllLocks()).withSelfRel());
        return new ResponseEntity<>(lockDTO, HttpStatus.OK);
    }

    @GetMapping("/lock/{lockId}")
    public HttpEntity<LockDTO> getSingleLock(@PathVariable String lockId) {
        Lock lock = lockFactory.getSingleLock(lockId);
        Lock[] locks = new Lock[]{lock};
        LockDTO lockDTO = new LockDTO(locks);
        lockDTO.add(linkTo(methodOn(LockController.class).getSingleLock(lockId)).withSelfRel());
        return new ResponseEntity<>(lockDTO, HttpStatus.OK);
    }

    @PostMapping("/lock")
    public HttpEntity<LockDTO> writeLock(@RequestBody Lock lock) {
        Lock lockReturn = lockFactory.writeLock(lock);
        Lock[] locks = new Lock[]{lock};
        LockDTO lockDTO = new LockDTO(locks);
        lockDTO.add(linkTo(methodOn(LockController.class).getSingleLock(lockReturn.getId())).withSelfRel());
        return new ResponseEntity<>(lockDTO, HttpStatus.OK);
    }

    @PostMapping("/lock/{lockId}/delete")
    public boolean deleteLock(@PathVariable String lockId) {
        Lock lock = new Lock(){};
        lock.setId(lockId);
        lockFactory.deleteLock(lock);
        return true;
    }
}
