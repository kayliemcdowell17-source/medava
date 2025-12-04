package edu.uc.cs3003.medava;

public enum MedicineSchedule {
    Uncontrolled("Uncontrolled"),
    ScheduleTwo("Schedule Two");

    private final String scheduleName;

    MedicineSchedule(String name) {
        scheduleName = name;
    }

    public String asString() {
        return scheduleName;
    }
}
