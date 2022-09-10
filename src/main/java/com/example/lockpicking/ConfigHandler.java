package com.example.lockpicking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ConfigHandler {

    private static ConfigHandler configHandler;
    public static Config config;

    private ConfigHandler(){
        this.readConfigFile();
    }

    private void readConfigFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        String workingDir = System.getProperty("user.dir");
        File file = new File(workingDir + "/ressources/config.json");
        try{
            this.config = objectMapper.readValue(
                    file, Config.class
            );
        }catch (Exception e){
            System.out.println("Can't read config");
        }
    }

    public static ConfigHandler getInstance(){
        if (null == configHandler) {
            configHandler = new ConfigHandler();
        }
        return configHandler;
    }
}
