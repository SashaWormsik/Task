package com.main.java.lisson6.Appliances;

public class Refrigerator extends LargeHomeAppliances {
    private int numberOfCameras;
    private String color;

    public Refrigerator(String company, int powerConsumption, int weight, int length, int width, int height, int numberOfCameras, String color) {
        super(company, powerConsumption, weight, length, width, height);
        this.numberOfCameras = numberOfCameras;
        this.color = color;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
