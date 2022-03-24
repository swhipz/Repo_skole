package no.hiof.fredrjen.oblig3;

import no.hiof.fredrjen.oblig3.models.Planet;
import no.hiof.fredrjen.oblig3.models.PlanetSystem;
import no.hiof.fredrjen.oblig3.models.Star;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Oppretter Star-objektet som representerer solsystemets sol
        Star sun = new Star("Sun", 1.0, 1.0, 5777, null);

        // Oppretter en rekke med planet-objekter
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        // Legger til planet-objektene i en arrayliste
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        // Oppretter planetsystemet "Solar system"
        PlanetSystem planetSystem = new PlanetSystem("Solar system", 1, 1, sun, planets);
        // Skriver ut beskrivelse for planetsystemet
        System.out.println(planetSystem);
        // Skriver ut en beskrivelse for alle planetene i planetsystemet
        System.out.println();
        for (Planet planet : planetSystem.getPlanets()) {
            System.out.println(planet);
        }
        // Skriver ut saturns radius og masse
        System.out.println();
        System.out.println("Saturn radius in Km: " + saturn.radiusInKm() + "\n" +
                "Saturn mass in kg: " + saturn.massInKg());
        // Skriver ut solens radius og masse
        System.out.println("Sun radius in km: " + sun.getRadiusInKm() +
                "\nSun mass in kg: " + sun.getMassInKg());
        // Skriver ut tyngdekraften for saturn og neptune
        System.out.println();
        System.out.println("Saturn surface gravity: " + saturn.getSurfaceGravity());
        System.out.println("Neptune surface gravity: " + neptune.getSurfaceGravity());
        // Skriver ut den største og minste planeten i planetsystemet
        System.out.println();
        System.out.println("Biggest planet in the solar system: " + planetSystem.getBiggestPlanet());
        System.out.println("Smallest planet in the solar system: " + planetSystem.getSmallestPlanet());
        // Skriver ut masse og radius i Mearth og Rearth for Mars
        System.out.println();
        System.out.println("Mars Mearth: " + mars.massInMearth());
        System.out.println("Mars Rearth: " + mars.radiusInRearth());

       //_--------------------------------------------------------------------------------------------
        //-------------------------------------OBLIG-3------------------------------------------------
        //---------------------------------------------------------------------------------------------
        System.out.println("----_________---_______--2.2-----______----_____-");
        System.out.println(planetSystem.findPlanetByName("Uranus"));
        System.out.println("------------------------------------------------- \n");

        System.out.println("____------______-------_2.6___------_____-_________-------_____-- \n");
        //  printF istedet for println for å konvertere 1.4.... verdiene til leselige KM-verdier
        System.out.println("Earth is this distance from the sun at the provided degree:");
        System.out.print("0 degrees: ");System.out.printf("%,.0f", earth.distanceToCentralBody(0));System.out.print("km \n");
        System.out.print("90 degrees: ");System.out.printf("%,.0f", earth.distanceToCentralBody(90));System.out.print("km \n");
        System.out.print("180 degrees: ");System.out.printf("%,.0f", earth.distanceToCentralBody(180));System.out.print("km \n");
        System.out.print("270 degrees: ");System.out.printf("%,.0f", earth.distanceToCentralBody(270));System.out.print("km \n");
        System.out.print("360 degrees: ");System.out.printf("%,.0f", earth.distanceToCentralBody(360));System.out.print("km \n");
        System.out.println("---------------------------------------------------------- \n");

        // print av oppgave 2.7
        System.out.println("_______-----________-------_2.7___-------________-----_____----- \n");
        System.out.println();
        System.out.println("At this given distance, the velocity of earth is: ");
        System.out.printf("%.0f", earth.distanceToCentralBody(0));System.out.print("km: ");System.out.printf("%.2f", earth.orbitingVelocity(earth.distanceToCentralBody(0)));System.out.print("m/s \n");
        System.out.printf("%.0f", earth.distanceToCentralBody(45));System.out.print("km: ");System.out.printf("%.2f", earth.orbitingVelocity(earth.distanceToCentralBody(45)));System.out.print("m/s \n");
        System.out.printf("%.0f", earth.distanceToCentralBody(90));System.out.print("km: ");System.out.printf("%.2f", earth.orbitingVelocity(earth.distanceToCentralBody(90)));System.out.print("m/s \n");
        System.out.printf("%.0f", earth.distanceToCentralBody(135));System.out.print("km: ");System.out.printf("%.2f", earth.orbitingVelocity(earth.distanceToCentralBody(135)));System.out.print("m/s \n");
        System.out.printf("%.0f", earth.distanceToCentralBody(180));System.out.print("km: ");System.out.printf("%.2f", earth.orbitingVelocity(earth.distanceToCentralBody(180)));System.out.print("m/s \n");
        System.out.println("------------------------------------------------------------------------ \n");




       // System.out.println("Earth is " + utskrift1 + " km away from the sun at 90 degrees.");



    }
}
