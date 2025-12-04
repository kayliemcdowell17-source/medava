package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;

public class Transporter {
    private String transporterName;
    private double mLowTemperature;
    private double mHighTemperature;
    private List<Shippable> goods;

    public Transporter(String name, double lowTemperature, double highTemperature) {
        transporterName = name;
        mLowTemperature = lowTemperature;
        mHighTemperature = highTemperature;
        goods = new ArrayList<Shippable>();
    }

    public String getTransporterName() {
        return transporterName;
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    public Shippable unload() {
        return goods.remove(0);
    }

    public boolean isEmpty() {
        return goods.isEmpty();
    }
}
