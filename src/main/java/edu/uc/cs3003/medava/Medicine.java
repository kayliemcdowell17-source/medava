package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable {
    private String mName;

    public Medicine(String name) {
        mName = name;
    }

    public String getMedicineName() {
        return mName;
    }

    public abstract MedicineSchedule getSchedule();
    public abstract double minimumTemperature();
    public abstract double maximumTemperature();

    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        return (minimumTemperature() <= lowTemperature && highTemperature <= maximumTemperature());
    }
}
