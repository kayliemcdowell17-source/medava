package edu.uc.cs3003.medava;

public class Pharmacy {

    public boolean send(Transporter t) {
        // Send Ibuprofen
        Medicine ibuprofen = new Ibuprofen();
        if (t.load(ibuprofen)) {
            System.out.println(String.format("Sending %s on the %s transporter.",
                    ibuprofen.getMedicineName(), t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s on to the %s transporter.",
                    ibuprofen.getMedicineName(), t.getTransporterName()));
            return false;
        }

        // Send Thrombolytic
        Thrombolytic thrombo = new Thrombolytic();
        thrombo.printSafeTemperature();
        if (t.load(thrombo)) {
            System.out.println(String.format("Sending %s on the %s transporter.",
                    thrombo.getMedicineName(), t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s on to the %s transporter.",
                    thrombo.getMedicineName(), t.getTransporterName()));
            return false;
        }

        // Send Oxycodone
        Medicine oxy = new Oxycodone();
        if (t.load(oxy)) {
            System.out.println(String.format("Sending %s on the %s transporter.",
                    oxy.getMedicineName(), t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s on to the %s transporter.",
                    oxy.getMedicineName(), t.getTransporterName()));
            return false;
        }

        // Send Jarvik Artificial Heart
        Medicine jarvik = new Jarvik();
        if (t.load(jarvik)) {
            System.out.println(String.format("Sending %s on the %s transporter.",
                    jarvik.getMedicineName(), t.getTransporterName()));
        } else {
            System.out.println(String.format("Cannot load %s on to the %s transporter.",
                    jarvik.getMedicineName(), t.getTransporterName()));
            return false;
        }

        return true;
    }
}

