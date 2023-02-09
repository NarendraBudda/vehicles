package com.vehicles;

public class Engine {
    private String modelNo;
    private float displacement;
    private int maxPower;
    private int maxRpm;
    private int noOfCylinders;

    public Engine(String modelNo,float displacement,int maxPower,int maxRpm,int noOfCylinders){
        this.modelNo=modelNo;
        this.displacement=displacement;
        this.maxPower=maxPower;
        this.maxRpm=maxRpm;
        this.noOfCylinders=noOfCylinders;
    }

    public void setModelNo(String modelNo){
        this.modelNo=modelNo;
    }
    public String getModelNo() {
        return modelNo;
    }
    public void setDisplacement(float displacement){
        this.displacement=displacement;
    }
    public float getDisplacement(){
        return displacement;
    }
    public void setMaxPower(int maxPower){
        this.maxPower=maxPower;
    }
    public int getMaxPower(){
        return maxPower;
    }
    public void setMaxRpm(int maxRpm){
        this.maxRpm=maxRpm;
    }
    public int getMaxRpm(){
        return maxRpm;
    }
    public void setNoOfCylinders(int noOfCylinders){
        this.noOfCylinders=noOfCylinders;
    }
    public int getNoOfCylinders(){
        return noOfCylinders;
    }


}
