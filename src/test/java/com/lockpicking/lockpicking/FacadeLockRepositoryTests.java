package com.lockpicking.lockpicking;

import com.lockpicking.lockEntries.FacadeLockRepository;
import com.lockpicking.lockEntries.Lock;
import com.lockpicking.lockEntries.LockRecordHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootTest
public class FacadeLockRepositoryTests {

    @Test
    public void createRecordPositive(){
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        DTOLockRecord lockRecord = new DTOLockRecord();
        Lock Lock = new Lock();
        Lock.setId("1");
        Lock.setName("Test");

        Links links = new Links();
        links.selfhref = "TestURL";
        links.lockhref = "TesterURL";

        lockRecord.DTOLock = Lock;
        lockRecord._links = links;

        String fileName = "Test.json";

        facadeLockRepository.createRecord(lockRecord, fileName);

        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.setFilename(fileName);
        String path = lockRecordHandler.getFinalPath();

        File file = new File(path);
        assert(file.exists());

        try{
            String data = Files.readString(Path.of(path));
            System.out.println(data);
            String toCheckName = "\"name\":\"Test\"";
            String toCheckId = "\"id\":\"1\"";
            String toCheckSelfHref = "\"selfhref\":\"TestURL\"";
            String toCheckLockHref = "\"lockhref\":\"TesterURL\"";
            assert(data.contains(toCheckName));
            assert(data.contains(toCheckId));
            assert(data.contains(toCheckSelfHref));
            assert(data.contains(toCheckLockHref));
        }catch (Exception e){
            assert false;
        }
        file.delete();

    }

    @Test
    public void createRecordEmptyRecord(){
        FacadeLockRepository facadeLockRepository = new FacadeLockRepository();
        DTOLockRecord lockRecord = new DTOLockRecord();

        String fileName = "Test.json";

        facadeLockRepository.createRecord(lockRecord, fileName);

        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.setFilename(fileName);
        String path = lockRecordHandler.getFinalPath();

        File file = new File(path);
        assert(!file.exists());
    }

}