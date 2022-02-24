package no.hiof.fredrjen.oblig2.models;

public class Star extends CelestialBodies{

   /* private String name;
    private double radius;
    private double mass; flyttet til cel_bodies */
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double radiusInKm() {
        return this.getRadius() * 695_700;
    }

    public double massInKg() {
        return this.getMass()* 1.98892E30;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * massInKg()) / Math.pow(radiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The star " + getName() + " has a radius of " + getRadius() +
                " Rsun, and a mass of " + getMass() + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
