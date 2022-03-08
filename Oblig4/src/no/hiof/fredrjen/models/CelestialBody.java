package no.hiof.fredrjen.models;

import no.hiof.fredrjen.interfaces.FileHandler;

public abstract class CelestialBody implements Comparable<CelestialBody>, FileHandler {
    private String name;
    private double radius, mass;

    public static final double GRAVITATIONAL_CONSTANT = 6.67408E-11;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    //________________-----------------------_______________________------------
    // oppgave 2.1

    @Override
    public int compareTo(CelestialBody o) {
        int planet = 0;
        if (this.getRadiusInKm() < o.getRadiusInKm()){
            return -1;
        } else if (this.getRadiusInKm() > o.getRadiusInKm()){
            return 1;
        }else{
            return 0;
        }

    }

    public abstract double getMassInKg();
    public abstract double getRadiusInKm();

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
}
