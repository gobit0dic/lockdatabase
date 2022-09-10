package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootTest
public class LockTests {

    public Lock lock = new Lock();

    @Test
    public void getSetName(){
        String nameSet = "TestName";
        this.lock.setName(nameSet);
        String name = this.lock.getName();
        assert(name == nameSet);
    }

    @Test
    public void getSetNumPins(){
        Integer numSet = 10;
        this.lock.setNumPins(numSet);
        Integer numGet = this.lock.getNumPins();
        assert(numSet == numGet);
    }

    @Test
    public void getSetWrench(){
        String nameSet = "TestWrench";
        this.lock.setWrench(nameSet);
        String name = this.lock.getWrench();
        assert(name == nameSet);
    }

    @Test
    public void getSetPick(){
        String nameSet = "TestPick";
        this.lock.setPick(nameSet);
        String name = this.lock.getPick();
        assert(name == nameSet);
    }

    @Test
    public void getSetType(){
        String nameSet = "TestType";
        this.lock.setType(nameSet);
        String name = this.lock.getType();
        assert(name == nameSet);
    }

    @Test
    public void getSetDateTime(){
        LocalDateTime dateTimeSet = LocalDateTime.now();
        this.lock.setDateTime(dateTimeSet);
        LocalDateTime dateTime = this.lock.getDateTime();
        assert(dateTime == dateTimeSet);
    }

    @Test
    public void getSetPinMap(){
        Map<Integer, String> pinMapSet = new HashMap<Integer, String>();
        pinMapSet.put(1, "Test");
        this.lock.setPinMap(pinMapSet);
        Map<Integer, String> pinMapGet = this.lock.getPinMapping();
        assert(pinMapGet == pinMapSet);
    }

}
