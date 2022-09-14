package com.lockpicking.lockAttribute;

public class LockAttribute {
    public String[] picks;
    public String[] wrenches;
    public String[] locks;
    public String[] pins;

    public String[] getWrenchTypes(){
        return this.wrenches;
    }

    public String[] getPickTypes(){
        return this.picks;
    }

    public String[] getLockTypes(){
        return this.locks;
    }

    public String[] getPinTypes(){
        return this.pins;
    }
}
