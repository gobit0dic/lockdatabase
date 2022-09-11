package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class DTOLockTests {

    public DTOLock DTOLock = new DTOLock();

    @Test
    public void getSetName(){
        String nameSet = "TestName";
        this.DTOLock.setName(nameSet);
        String name = this.DTOLock.getName();
        assert(name == nameSet);
    }

    @Test
    public void getSetNumPins(){
        Integer numSet = 10;
        this.DTOLock.setNumPins(numSet);
        Integer numGet = this.DTOLock.getNumPins();
        assert(numSet == numGet);
    }

    @Test
    public void getSetWrench(){
        String nameSet = "TestWrench";
        this.DTOLock.setWrench(nameSet);
        String name = this.DTOLock.getWrench();
        assert(name == nameSet);
    }

    @Test
    public void getSetPick(){
        String nameSet = "TestPick";
        this.DTOLock.setPick(nameSet);
        String name = this.DTOLock.getPick();
        assert(name == nameSet);
    }

    @Test
    public void getSetType(){
        String nameSet = "TestType";
        this.DTOLock.setType(nameSet);
        String name = this.DTOLock.getType();
        assert(name == nameSet);
    }

    @Test
    public void getSetDateTime(){
        LocalDateTime dateTimeSet = LocalDateTime.now();
        this.DTOLock.setDateTime(dateTimeSet);
        LocalDateTime dateTime = this.DTOLock.getDateTime();
        assert(dateTime == dateTimeSet);
    }

    @Test
    public void getSetPinMap(){
        Map<Integer, String> pinMapSet = new HashMap<Integer, String>();
        pinMapSet.put(1, "Test");
        this.DTOLock.setPinMap(pinMapSet);
        Map<Integer, String> pinMapGet = this.DTOLock.getPinMapping();
        assert(pinMapGet == pinMapSet);
    }

    @Test
    public void getId(){
        String setId = "1";
        this.DTOLock.setId(setId);
        String idGet = this.DTOLock.getId();
        assert(idGet == setId);
    }

}
