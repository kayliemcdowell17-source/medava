package edu.uc.cs3003.medava;

public class Oxycodone extends Medicine {

    public Oxycodone() {
        super("Oxycodone");
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Two;
    }

    @Override
    public double minimumTemperature() {
        return 15.0;
    }

    @Override
    public double maximumTemperature() {
        return 25.0;
    }
}
