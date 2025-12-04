package edu.uc.cs3003.medava;

public class Ibuprofen extends Medicine {
    public Ibuprofen() {
        super("Ibuprofen");
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }
}

