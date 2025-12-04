package edu.uc.cs3003.medava;

public class Jarvik extends Medicine {
    public Jarvik() {
        super("Jarvik Artificial Heart");
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }
}

