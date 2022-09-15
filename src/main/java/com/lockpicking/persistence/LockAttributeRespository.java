package com.lockpicking.persistence;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lockpicking.lockAttribute.LockAttribute;
import com.lockpicking.lockAttribute.LockAttributeServiceInterface;

import java.io.File;

public class LockAttributeRespository implements LockAttributeServiceInterface {
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
