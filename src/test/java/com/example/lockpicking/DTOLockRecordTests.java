package com.example.lockpicking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DTOLockRecordTests {

    @Test
    public void DTOLockRecord(){
        DTOLockRecord lockRecord = new DTOLockRecord();
        DTOLock DTOLock = new DTOLock();
        DTOLock.setId("1");
        DTOLock.setName("Test");

        Links links = new Links();
        links.selfhref = "TestURL";
        links.lockhref = "TesterURL";

        lockRecord.DTOLock = DTOLock;
        lockRecord._links = links;

        assert(lockRecord.DTOLock.getId() == "1");
        assert(lockRecord.DTOLock.getName() == "Test");
    }


}
