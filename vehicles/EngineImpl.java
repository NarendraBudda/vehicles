package com.vehicles;

public class EngineImpl {
    public static void main(String args[]) {
        PetrolEngine petrolEngine = new PetrolEngine("12E45N", 325.14f, 150, 1000, 4);
        DieselEngine dieselEngine = new DieselEngine("5663B", 307.45f, 225, 1600, 3);
        CNGEngine cngEngine = new CNGEngine("1247CL", 274f, 175, 800, 2);
        ElectricEngine electricEngine = new ElectricEngine("785A6M", 150f, 220, 1500, 3, 10000);


        System.out.println("Petrol Engine properties ");
        System.out.println(petrolEngine.getModelNo());
        System.out.println(petrolEngine.getDisplacement());
        System.out.println(petrolEngine.getMaxPower());
        System.out.println(petrolEngine.getMaxRpm());
        System.out.println(petrolEngine.getNoOfCylinders());

        System.out.println("Diesel Engine properties ");
        System.out.println(dieselEngine.getModelNo());
        System.out.println(dieselEngine.getDisplacement());
        System.out.println(dieselEngine.getMaxPower());
        System.out.println(dieselEngine.getMaxRpm());
        System.out.println(dieselEngine.getNoOfCylinders());

        System.out.println("CNG Engine properties ");
        System.out.println(cngEngine.getModelNo());
        System.out.println(cngEngine.getDisplacement());
        System.out.println(cngEngine.getMaxPower());
        System.out.println(cngEngine.getMaxRpm());
        System.out.println(cngEngine.getNoOfCylinders());

        System.out.println("Electric Engine properties ");
        System.out.println(electricEngine.getModelNo());
        System.out.println(electricEngine.getDisplacement());
        System.out.println(electricEngine.getMaxPower());
        System.out.println(electricEngine.getMaxRpm());
        System.out.println(electricEngine.getNoOfCylinders());
        System.out.println(electricEngine.getVoltage());
    }
}
