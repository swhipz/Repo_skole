package no.hiof.fredrjen.oblig2.models;

public class Planet implements CelestialBodies{

   /* private String name;
    private double radius;
    private double mass; flyttet til cel_bodies */
    // lage konstanter
    private final static int kmRjup = 71492;
    private final static double kgMjup = 1.898E27;
    private final static double kgMearth = 5.972E24;
    private final static double sGravity = 6.7408E-11;


    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;

        super()
    }
    public double radiusInKm() {
        return radius * getKmRjup();
    }

    public double massInKg() {
        return mass * getKgMjup();
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
        return "The planet " + name + " has a radius of " + radius +
                " Rjup, and a mass of " + mass + " Mjup.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public static int getKmRjup() {
        return kmRjup;
    }

    public static double getKgMjup() {
        return kgMjup;
    }

    public static int getKmRearth() {
        return kmRearth;
    }

    public static double getKgMearth() {
        return kgMearth;
    }

    public static double getsGravity() {
        return sGravity;
    }
}

