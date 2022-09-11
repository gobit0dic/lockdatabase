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
    public static final String path = System.getProperty("user.dir") + "/mockDatabase/locks/";
    public String filename;
    public String finalPath;

    public void setFilename(String filename){
        this.filename = filename;
        this.finalPath = path + filename;
    }

    public String getFinalPath(){
        return this.finalPath;
    }

    public void createFileIfNotExists(){
        File file = new File(this.finalPath);
        if(!file.exists() && !file.isDirectory()) {
            try{
                boolean success = file.createNewFile();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public boolean checkRecordForValues(DTOLockRecord lockRecord){
        if(lockRecord.DTOLock == null && lockRecord._links == null){
            return false;
        }else{
            return true;
        }
    }

    public Boolean writeRecord(String jsonString){
        String contentToAppend = jsonString + System.lineSeparator();
        try {
            Files.write(
                Paths.get(this.finalPath),
                contentToAppend.getBytes(),
                StandardOpenOption.APPEND
            );
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
