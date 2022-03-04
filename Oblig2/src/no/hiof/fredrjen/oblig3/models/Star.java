package no.hiof.fredrjen.oblig3.models;

public class Star extends CelestialBody {

   /* private String name;
    private double radius;
    private double mass; flyttet til cel_bodies */
    private static double kgRsun = 1.98892E30;
    private static double kmRsun = 	695_700;
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp, CelestialBody centralCelestialBody) {
        super(name, radius, mass, centralCelestialBody);
        this.effectiveTemp = effectiveTemp;
    }
    @Override
    public double getRadiusInKm() {
        return this.getRadius() * kmRsun;
    }
    @Override
    public double getMassInKg() {
        return this.getMass()* kgRsun;
    }

    public double getSurfaceGravity() {
        return (6.67408E-11 * getMassInKg()) / Math.pow(getRadiusInKm()*1000, 2);
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
