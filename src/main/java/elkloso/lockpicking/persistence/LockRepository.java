package elkloso.lockpicking.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import elkloso.lockpicking.lockEntries.Lock;
import elkloso.lockpicking.lockEntries.LockServiceInterface;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LockRepository implements LockServiceInterface {
    private static final String path = System.getProperty("user.dir") + "/mockDatabase/locks/";
    private String filename;
    private String finalPath;
    private ObjectMapper objectMapper = new ObjectMapper();
    private String userId;
    private static final String FILETYPE = ".json";

    public void setUserId(Lock lock){
        this.userId = lock.getUserId();
    }

    public void setFilename(){
        this.filename = this.userId + FILETYPE;
        this.finalPath = path + filename;
    }

    public Lock[] getAllLocks(){
        Lock[] locks = new Lock[]{};
        //TODO
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

    public boolean writeLock(Lock lockRecord){
        String jsonString = null;
        try {
            jsonString = objectMapper.writeValueAsString(lockRecord);
        } catch (JsonProcessingException e) {
            System.out.println(e);
            return false;
        }
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
        //TODO
        return false;
    };

}
