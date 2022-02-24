package no.hiof.fredrjen.oblig2.models;

abstract class CelestialBodies {

    private String name;
    private double radius;
    private double mass;
    private String svada = "";

    public CelestialBodies(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
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

    public String getSvada() {
        return svada;
    }

    public void setSvada(String svada) {
        this.svada = svada;
    }
}
