package edu.uc.cs3003.medava;

public class Thrombolytic extends Medicine {
    public Thrombolytic() {
        super("Thrombolytic");
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }

    public void printSafeTemperature() {
        System.out.println("Getting the minimum safe temperature for a Thrombolytic drug.");
        System.out.println("Getting the maximum safe temperature for a Thrombolytic drug.");
    }
}

