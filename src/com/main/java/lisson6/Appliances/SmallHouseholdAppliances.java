package com.main.java.lisson6.Appliances;

public class SmallHouseholdAppliances extends Appliances {
    private boolean stationary;
    private boolean portable;

    public SmallHouseholdAppliances(String company, int powerConsumption, boolean stationary, boolean portable) {
        super(company, powerConsumption);
        this.stationary = stationary;
        this.portable = portable;
    }

    public boolean isStationary() {
        return stationary;
    }

    public void setStationary(boolean stationary) {
        this.stationary = stationary;
    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }
}
