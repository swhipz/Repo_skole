package no.hiof.fredrjen.oblig2.models;

import java.io.PrintStream;

public class Planet extends NaturalSatelite {

    /* private String name;
     private double radius;
     private double mass; flyttet til cel_bodies */
    // lage konstanter
    private final static int kmRjup = 71492;
    private final static double kgMjup = 1.898E27;
    private final static double kgMearth = 5.972E24;
    private final static int kmRearth = 6371;
    private final static double sGravity = 6.7408E-11;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, int orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);


    }


    @Override
    public double distanceToCentralBody(double degrees) {
        double t0 = Math.cos(Math.toRadians(degrees));
        double r = getSemiMajorAxis() * (1 - Math.pow(getEccentricity(), 2)) /
                (1 + getEccentricity() * t0);
        return r * getaU();
    }

    @Override
    public double orbitingVelocity(double distance) {
        double g = 6.67408E-11;
        double v;
        v = Math.sqrt(g * (getCentralCelestialBody().getMassInKg() / (distance * 1000)));
        return v / 1000;
    }


    public double radiusInKm() {
        return super.getRadius() * getKmRjup();
    }

    public double massInKg() {
        return getMass() * getKgMjup();
    }

    public double radiusInRearth() {
        return radiusInKm() / getKmRearth();
    }

    public double massInMearth() {
        return massInKg() / getKgMearth();
    }


    public double getSurfaceGravity() {
        return (getsGravity() * massInKg()) / Math.pow(radiusInKm() * 1000, 2);
    }


    @Override
    public String toString() {
        return "The planet " + getName() + " has a radius of " + getRadius() +
                " Rjup, and a mass of " + getMass() + " Mjup.";

    }


    public void printDistVel(double degrees) {
        double x = 0;
        double y = Math.cos(Math.toRadians(degrees));

        System.out.println("The planet" + getName() + " is " + distanceToCentralBody(x) + "km away from earth at " + y + "degrees. ");

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

    @Override
    public double getMassInKg() {
        return this.getMass() * kgMjup;
    }

    @Override
    public double getRadiusInKm() {
        return this.getRadius() * kmRjup;
    }
}

