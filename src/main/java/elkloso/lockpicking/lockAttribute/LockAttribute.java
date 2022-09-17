package elkloso.lockpicking.lockAttribute;

public class LockAttribute {
    public String[] picks;
    public String[] wrenches;
    public String[] locks;
    public String[] pins;

    public String[] getWrenchTypes(){
        return this.wrenches;
    }

    public void setWrenchTypes(String[] wrenchTypes){
        this.wrenches = wrenchTypes;
    }

    public String[] getPickTypes(){
        return this.picks;
    }

    public void setPickTypes(String[] pickTypes){
        this.picks = pickTypes;
    }

    public String[] getLockTypes(){
        return this.locks;
    }

    public void setLockTypes(String[] lockTypes){
        this.locks = lockTypes;
    }

    public String[] getPinTypes(){
        return this.pins;
    }

    public void setPinTypes(String[] pinTypes){
        this.pins = pinTypes;
    }
}
