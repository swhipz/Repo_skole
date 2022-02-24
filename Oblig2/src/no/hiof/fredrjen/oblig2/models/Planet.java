package no.hiof.fredrjen.oblig2.models;

public class Planet extends CelestialBodies{

   /* private String name;
    private double radius;
    private double mass; flyttet til cel_bodies */
    // lage konstanter
    private final static int kmRjup = 71492;
    private final static double kgMjup = 1.898E27;
    private final static double kgMearth = 5.972E24;
    private final static int kmRearth = 6371;
    private final static double sGravity = 6.7408E-11;

    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);


    }
    public double radiusInKm() {
        return super.getRadius() * getKmRjup();
    }

    public double massInKg() {
        return getMass() * getKgMjup();
    }

    public double radiusInRearth() {
        return radiusInKm()/getKmRearth();
    }

    public double massInMearth() {
        return massInKg()/getKgMearth();
    }



    public double getSurfaceGravity() {
        return (getsGravity() * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }


    @Override
    public String toString() {
        return "The planet " + getName() + " has a radius of " + getRadius() +
                " Rjup, and a mass of " + getMass() + " Mjup.";
    }

    public static int getKmRjup() {
        return kmRjup;
    }

    public static double getKgMjup() {
        return kgMjup;
    }

    public static int getKmRearth() {
        return kmRearth ;
    }

    public static double getKgMearth() {
        return kgMearth;
    }

    public static double getsGravity() {
        return sGravity;
    }
}

