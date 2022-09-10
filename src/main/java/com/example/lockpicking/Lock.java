package com.example.lockpicking;

import java.util.EnumMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Lock {
    private String NAME;
    private LocalDateTime DATETIME;
    private Integer NUMPINS;
    private String WRENCH;
    private String PICK;
    private Map<Integer, String> PINMAPPING;
    private String TYPE;
    private String[] WRENCHTYPES;
    private String[] PICKTYPES;
    private String[] LOCKTYPES;
    private String[] PINTYPES;

    public Lock(){
        this.setLockAttributes();
    }

    public String getName(){
        return this.NAME;
    }

    public LocalDateTime getDateTime(){
        return this.DATETIME;
    }

    public Integer getNumPins(){
        return this.NUMPINS;
    }

    public String getWrench(){
        return this.WRENCH;
    }

    public String getPick(){
        return this.PICK;
    }

    public Map<Integer, String> getPinMapping(){
        return this.PINMAPPING;
    }

    public String getType(){
        return this.TYPE;
    }

    public String[] getWrenchTypes(){
        return this.WRENCHTYPES;
    }

    public String[] getPickTypes(){
        return this.PICKTYPES;
    }

    public String[] getLockTypes(){
        return this.LOCKTYPES;
    }

    public String[] getPinTypes(){
        return this.PINTYPES;
    }

    public void setName(String name){
        this.NAME = name;
    }

    public void setWrench(String wrenchName){
        this.WRENCH = wrenchName;
    }

    public void setPick(String pickName){
        this.PICK = pickName;
    }

    public void setType(String typeName){
        this.TYPE = typeName;
    }

    public void setNumPins(Integer numPins){
        this.NUMPINS = numPins;
    }

    public void setDateTime(LocalDateTime DateTime){
        this.DATETIME = DateTime;
    }

    public void setPinMap(Map<Integer, String> pinMap){
        this.PINMAPPING = pinMap;
    }

    public void setLockAttributes(){
        ConfigHandler configHandler = ConfigHandler.getInstance();
        this.WRENCHTYPES = configHandler.config.wrenches;
        this.PICKTYPES = configHandler.config.picks;
        this.LOCKTYPES = configHandler.config.locks;
        this.PINTYPES = configHandler.config.pins;
    }

}
