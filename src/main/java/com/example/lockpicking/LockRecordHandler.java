package com.example.lockpicking;

import org.springframework.boot.configurationprocessor.json.JSONStringer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LockRecordHandler {

    //TODO Dynamic for each user new file
    public static final String path = System.getProperty("user.dir") + "/moackDatabase/locks/locks.json";

    public void createFileIfNotExists(){
        File file = new File(this.path);
        if(!file.exists() && !file.isDirectory()) {
            try{
                boolean success = file.createNewFile();
            }catch(Exception e){}
        }
    }

    public String dtoToString(DTOLockRecord lockRecord){
        String dtoString = "";

        return dtoString;
    }

    public Boolean writeRecord(String jsonString){
        String contentToAppend = jsonString + System.lineSeparator();
        try {
            Files.write(
                    Paths.get(this.path),
                    contentToAppend.getBytes(),
                    StandardOpenOption.APPEND);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
