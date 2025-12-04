package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable {
    private String name;

    public Medicine(String name) {
        this.name = name;
    }

    @Override
    public String getMedicineName() {
        return name;
    }

    @Override
    public boolean isTemperatureRangeAcceptable(double low, double high) {
        return true; // default; override if needed
    }

    @Override
    public abstract MedicineSchedule getSchedule();
}
