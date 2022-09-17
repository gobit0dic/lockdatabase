package elkloso.lockpicking.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import elkloso.lockpicking.lockEntries.Lock;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LockRepository {
    private static final String path = System.getProperty("user.dir") + "/mockDatabase/locks/";
    private String finalPath;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private String userId;
    private static final String FILETYPE = ".json";

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setFilename(){
        String filename = this.userId + FILETYPE;
        this.finalPath = path + filename;
    }

    public Lock[] getAllLocks(){
        ObjectMapper objectMapper = new ObjectMapper();
        Lock[] locks = new Lock[]{};
        File file = new File(finalPath);
        try{
            locks = objectMapper.readValue(
                    file, Lock[].class
            );
        }catch (Exception e){
            System.out.println("Can't read lock file: " + e);
        }
        return locks;
    }

    public Lock getSingleLock(String lockId){
        Lock[] allLocks = getAllLocks();
        for(Lock lock : allLocks){
            if(lock.getId().equals(lockId)){
                return lock;
            }
        }
        return null;
    }

    public void createFileIfNotExists(){
        File file = new File(this.finalPath);
        if(!file.exists() && !file.isDirectory()) {
            try{
                boolean isSuccess = file.createNewFile();
                if(isSuccess){
                    String fileContent = "[]";
                    Files.write(
                            Paths.get(this.finalPath),
                            fileContent.getBytes(),
                            StandardOpenOption.WRITE
                    );
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public boolean writeLock(Lock lockRecord){
        String jsonString;
        try {
            jsonString = objectMapper.writeValueAsString(lockRecord);
        } catch (JsonProcessingException e) {
            System.out.println(e);
            return false;
        }
        String contentToAppend = jsonString + "," + System.lineSeparator();
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

    public boolean writeLocks(Lock[] locks){
        String jsonString;
        try {
            jsonString = objectMapper.writeValueAsString(locks);
        } catch (JsonProcessingException e) {
            System.out.println("JsonProcessingException: " + e);
            return false;
        }

        String fileContent = jsonString;
        try {
            Files.write(
                    Paths.get(this.finalPath),
                    fileContent.getBytes(),
                    StandardOpenOption.WRITE
            );
            return true;
        }catch (Exception e){
            System.out.println("File Write Exception: " + e);
            return false;
        }
    }

    public Lock[] deleteLockFromArray(Lock lock){
        Lock[] allLocks = getAllLocks();
        if(allLocks.length > 0){
            Lock[] allLocksNew = new Lock[allLocks.length-1];
            int index = 0;
            for(Lock lockFromAll : allLocks){
                if(lockFromAll.getId() != lock.getId()){
                    allLocksNew[index] = lockFromAll;
                }
            }
            return allLocksNew;
        }
       return allLocks;
    }

}
