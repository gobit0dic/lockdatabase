package com.lockpicking.lockEntries;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LockRepository implements LockServiceInterface {
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

    public Lock[] getAllLocks(){
        Lock[] locks = new Lock[]{};
        return locks;
    };

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

    public boolean writeLock(String jsonString){
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
    };

    public boolean deleteLock(Lock lock){
        return false;
    };

}
