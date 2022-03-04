package no.hiof.fredrjen.oblig2.models;

abstract class CelestialBody {

    private String name;
    private double radius;
    private double mass;
    private String svada = "";
    private CelestialBody centralCelestialBody;

    private static int aU = 149597871; // 1AU

    public CelestialBody(String name, double radius, double mass, CelestialBody centralCelestialBody) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.centralCelestialBody = centralCelestialBody;
    }

    public abstract double getMassInKg();
    public abstract double getRadiusInKm();






    public int getaU(){
        return aU;
    }
    public void setaU(int aU){
        this.aU = aU;
    }



    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
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
