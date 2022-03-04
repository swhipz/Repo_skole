package no.hiof.fredrjen.oblig3.models;

import java.util.ArrayList;

public class PlanetSystem extends CelestialBody {
    private Star centerStar;
    private ArrayList<Planet> planets;
    private String sName;

    public PlanetSystem(String name, double radius, double mass, Star centerStar, ArrayList<Planet> planets) {
        super(name, radius, mass, centerStar.getCentralCelestialBody());
        this.centerStar = centerStar;
        this.planets = planets;

    }






    public Planet findPlanetByName(String planetName) {
        for (Planet planet : planets) {
            if (planet.getName().equals(planetName)) {
                return planet;
            }
        }
        return null;
    }





    public Planet getBiggestPlanet() {
        Planet biggestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() > biggestPlanet.getRadius()) {
                biggestPlanet = planet;
            }
            else if (planet.getRadius() == biggestPlanet.getRadius() &&
            planet.getMass() > biggestPlanet.getMass()) {
                biggestPlanet = planet;
            }
        }
        return biggestPlanet;
    }

    public Planet getSmallestPlanet() {
        Planet smallestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = planet;
            }
            else if (planet.getRadius() == smallestPlanet.getRadius() &&
                    planet.getMass() < smallestPlanet.getMass()) {
                smallestPlanet = planet;
            }
        }
        return smallestPlanet;
    }

    @Override
    public String toString() {
        return "The planet system " + getName() + " has the center star " + centerStar.getName() +
                " and a total of " + planets.size() + " planets.";
    }
    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public double getMassInKg() {
        return 0;
    }

    @Override
    public double getRadiusInKm() {
        return 0;
    }
}
