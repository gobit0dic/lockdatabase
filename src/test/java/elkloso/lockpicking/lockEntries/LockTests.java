package elkloso.lockpicking.lockEntries;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class LockTests {

    public elkloso.lockpicking.lockEntries.Lock Lock = new Lock();

    @Test
    public void getSetName(){
        String nameSet = "TestName";
        this.Lock.setName(nameSet);
        String name = this.Lock.getName();
        assert(name == nameSet);
    }

    @Test
    public void getSetNumPins(){
        Integer numSet = 10;
        this.Lock.setNumPins(numSet);
        Integer numGet = this.Lock.getNumPins();
        assert(numSet == numGet);
    }

    @Test
    public void getSetWrench(){
        String nameSet = "TestWrench";
        this.Lock.setWrench(nameSet);
        String name = this.Lock.getWrench();
        assert(name == nameSet);
    }

    @Test
    public void getSetPick(){
        String nameSet = "TestPick";
        this.Lock.setPick(nameSet);
        String name = this.Lock.getPick();
        assert(name == nameSet);
    }

    @Test
    public void getSetType(){
        String nameSet = "TestType";
        this.Lock.setType(nameSet);
        String name = this.Lock.getType();
        assert(name == nameSet);
    }

    @Test
    public void getSetDateTime(){
        LocalDateTime dateTimeSet = LocalDateTime.now();
        this.Lock.setDateTime(String.valueOf(dateTimeSet));
        String dateTime = this.Lock.getDateTime();
        assert(String.valueOf(dateTime).contains(String.valueOf(dateTimeSet)));
    }

    @Test
    public void getSetPinMap(){
        Map<Integer, String> pinMapSet = new HashMap<Integer, String>();
        pinMapSet.put(1, "Test");
        this.Lock.setPinMap(pinMapSet);
        Map<Integer, String> pinMapGet = this.Lock.getPinMapping();
        assert(pinMapGet == pinMapSet);
    }

    @Test
    public void getSetId(){
        String setId = "1";
        this.Lock.setId(setId);
        String idGet = this.Lock.getId();
        assert(idGet == setId);
    }

    @Test
    public void getSetUserId(){
        String setId = "1";
        this.Lock.setUserId(setId);
        String idGet = this.Lock.getUserId();
        assert(idGet == setId);
    }

}
