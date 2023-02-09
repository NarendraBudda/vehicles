package com.vehicles;

public class ElectricEngine extends Engine{
    private int voltage;

    public ElectricEngine(String modelNo,float displacement,int maxPower,int maxRpm,int noOfCylinders,int voltage) {
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinders);
        this.voltage = voltage;
    }


    public void setVoltage(int voltage){
        this.voltage=voltage;
    }
    public int getVoltage(){
        return voltage;
    }

}
