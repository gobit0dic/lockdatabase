package com.lockpicking.lockpicking;

import com.lockpicking.lockEntries.LockRecordHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootTest
public class LockRecordHandlerTests {

    @Test
    public void createFileIfNotExistsWithoutFile(){
        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.setFilename("Test.json");
        lockRecordHandler.createFileIfNotExists();
        String path = lockRecordHandler.getFinalPath();
        File file = new File(path);
        assert(file.exists());
        file.delete();
    }

    @Test
    public void createFileIfNotExistsWithExistingFile(){
        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.setFilename("Test.json");
        lockRecordHandler.createFileIfNotExists();
        String path = lockRecordHandler.getFinalPath();
        File file = new File(path);
        assert(file.exists());
        if(file.exists()){
            lockRecordHandler.createFileIfNotExists();
        }
        file = new File(path);
        assert(file.exists());
        file.delete();
    }

    @Test
    public void writeRecord(){
        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.setFilename("Test.json");
        lockRecordHandler.createFileIfNotExists();
        lockRecordHandler.writeRecord("TestString");
        lockRecordHandler.writeRecord("TestNewLine");
        String path = lockRecordHandler.getFinalPath();
        File file = new File(path);
        assert(file.exists());
        try{
            String data = Files.readString(Path.of(path));
            String toCheck = "TestString" + System.lineSeparator() + "TestNewLine" + System.lineSeparator();
            assert(data.contains(toCheck));
        }catch (Exception e){
            assert false;
        }
        file.delete();
    }

    @Test
    public void writeRecordFailed(){
        LockRecordHandler lockRecordHandler = new LockRecordHandler();
        lockRecordHandler.writeRecord("TestString");
        lockRecordHandler.writeRecord("TestNewLine");
        String path = lockRecordHandler.getFinalPath();
    }

}
