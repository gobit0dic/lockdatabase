package com.lockpicking.lockEntries;

import com.lockpicking.lockpicking.DTO;

import java.util.Map;
import java.time.LocalDateTime;

public class Lock implements DTO {

    private String Id;
    private String NAME;
    private LocalDateTime DATETIME;
    private Integer NUMPINS;
    private String WRENCH;
    private String PICK;
    private Map<Integer, String> PINMAPPING;
    private String TYPE;

    public Lock(){
    }

    public String getId(){
        return this.Id;
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

    public void setId(String id){
        this.Id = id;
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

}
