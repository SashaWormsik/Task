package com.main.java.lisson6.Appliances;

public class Appliances implements TurnOffOrOn{
    private String company;
    private int powerConsumption;
    private boolean status;

    public Appliances(String company, int powerConsumption) {
        this.company = company;
        this.powerConsumption = powerConsumption;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public void on() {
        this.status = true;
        System.out.println("устройство включено");
    }

    @Override
    public void off() {
        this.status = false;
        System.out.println("устройство выключено");
    }
}
