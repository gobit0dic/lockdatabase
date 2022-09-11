package com.example.lockpicking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ConfigHandler {

    private static ConfigHandler configHandler;
    public static Config config;
    public static final String path = System.getProperty("user.dir") + "/ressources/config.json";

    private ConfigHandler(){
        this.readConfigFile();
    }

    private void readConfigFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(this.path);
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
