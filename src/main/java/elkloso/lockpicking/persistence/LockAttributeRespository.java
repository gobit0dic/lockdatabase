package elkloso.lockpicking.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import elkloso.lockpicking.lockAttribute.LockAttribute;
import elkloso.lockpicking.lockAttribute.LockAttributeService;

import java.io.File;

public class LockAttributeRespository implements LockAttributeService {
    private static LockAttribute lockAttribute;
    private static final String path = System.getProperty("user.dir") + "/ressources/config.json";

    public LockAttributeRespository(){
        this.readConfigFile();
    }

    private void readConfigFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);
        try{
            lockAttribute = objectMapper.readValue(
                    file, LockAttribute.class
            );
        }catch (Exception e){
            System.out.println("Can't read config: " + e);
        }
    }

    @Override
    public LockAttribute getLockAttributes(){
        return lockAttribute;
    }

}
