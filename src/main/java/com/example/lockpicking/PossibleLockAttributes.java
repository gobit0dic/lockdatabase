package com.example.lockpicking;

public class PossibleLockAttributes implements DTO {

    private static PossibleLockAttributes instance;

    public String[] WRENCHTYPES;
    public String[] LOCKTYPES;
    public String[] PICKTYPES;
    public String[] PINTYPES;

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

    private PossibleLockAttributes() {
        this.setLockAttributesFromConfig();
    }

    private void setLockAttributesFromConfig(){
        ConfigHandler configHandler = ConfigHandler.getInstance();
        this.WRENCHTYPES = configHandler.config.wrenches;
        this.PICKTYPES = configHandler.config.picks;
        this.LOCKTYPES = configHandler.config.locks;
        this.PINTYPES = configHandler.config.pins;
    }

    public static PossibleLockAttributes getInstance(){
        if(instance == null){
            instance = new PossibleLockAttributes();
        }
        return instance;
    }

}
