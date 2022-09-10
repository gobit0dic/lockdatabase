package com.example.lockpicking;

import java.util.EnumMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Lock {

    private String NAME;
    private LocalDateTime DATETIME;
    private Integer NUMPINS;
    private String WRENCH;
    private String PICK;
    private Map<Integer, String> PINMAPPING;
    private String TYPE;

    //TODO Read from Config File
    private String[] WRENCHTYPES = new String[]{
            "MP3SP11",
            "MP3SP12",
            "MP3SP13",
            "MP3SP14",
            "MP3SP15",
            "MP3SP16",
            "MP3SP17"
    };

    private String[] PICKTYPES = new String[]{
            "PNF04",
            "PNF05",
            "PNF06",
            "PNF31",
            "PNF58",
            "PNF60",
    };

    private String[] LOCKTYPES = new String[]{
            "Padlock - Pins",
            "Padlock - Disc",
            "Wafer Core"
    };

    private String[] PINTYPES = new String[]{
            "Normal",
            "Hybrid",
            "Spool",
            "Serated"
    };

    public Lock(){
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

    public String getPinMapping(Integer NumPin){
        String PinValue = this.PINMAPPING.get(NumPin);
        return PinValue;
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

}
