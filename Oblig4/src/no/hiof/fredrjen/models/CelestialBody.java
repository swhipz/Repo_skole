package no.hiof.fredrjen.models;

public abstract class CelestialBody implements Comparable<Planet>{
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
    public int compareTo(Planet o) {

        if (this.getRadiusInKm() < o.getRadiusInKm()) {
            return -1;// disse. --- Bytt disse verdiene for å endre fra høyest til lavest
        } else if (this.getRadiusInKm() > o.getRadiusInKm()) {
            return 1; // disse.
        } else {
            return 0; // om de er like store returner null
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
