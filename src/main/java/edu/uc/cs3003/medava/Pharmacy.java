package edu.uc.cs3003.medava;

public class Pharmacy {
    private String pharmacyName;

    public Pharmacy(String name) {
        pharmacyName = name;
    }

    public boolean send(Transporter t) {
        Medicine advil = new Ibuprofen();
        if (t.load(advil)) {
            System.out.println(String.format("Sending %s on the %s transporter.", advil.getMedicineName(),
                    t.getTransporterName()));
        }

        Medicine activase = new Thrombolytic();
        System.out.println("Getting the minimum safe temperature for a Thrombolytic drug.");
        System.out.println("Getting the maximum safe temperature for a Thrombolytic drug.");
        if (t.load(activase)) {
            System.out.println(String.format("Sending %s on the %s transporter.", activase.getMedicineName(),
                    t.getTransporterName()));
        }

        Medicine oxycontin = new Oxycodone();
        if (t.load(oxycontin)) {
            System.out.println(String.format("Sending %s on the %s transporter.", oxycontin.getMedicineName(),
                    t.getTransporterName()));
        }

        Jarvik heart = new Jarvik("01j9a9lk71");
        if (t.load(heart)) {
            System.out.println(String.format("Sending %s on the %s transporter.", heart.getMedicineName(),
                    t.getTransporterName()));
        }

        return true;
    }
}
