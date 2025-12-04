package edu.uc.cs3003.medava;

import java.util.ArrayList;
import java.util.List;

public class Transporter {
    private String mName;
    private double mLowTemperature;
    private double mHighTemperature;
    private List<Shippable> goods;

    public Transporter(String name, double lowTemp, double highTemp) {
        mName = name;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
        goods = new ArrayList<Shippable>();
    }

    public String getTransporterName() {
        return mName;
    }

    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            return goods.add(itemToLoad);
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
