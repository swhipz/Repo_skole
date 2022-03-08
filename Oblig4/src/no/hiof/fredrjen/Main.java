package no.hiof.fredrjen;

import no.hiof.fredrjen.models.Planet;
import no.hiof.fredrjen.models.PlanetSystem;
import no.hiof.fredrjen.models.Star;
import org.w3c.dom.css.CSSUnknownRule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Star sun = new Star("Sun", 1.0, 1.0, 5777);
/*
	    PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);

	    Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
	    solarSystem.addPlanet(mercury);
	    solarSystem.addPlanet(new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun));
        solarSystem.addPlanet(new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun));
        solarSystem.addPlanet(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun));
        solarSystem.addPlanet(new Planet("Jupiter",1.0, 1.0, 5.20440, 0.049, 4380, sun));
        solarSystem.addPlanet(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun));
        solarSystem.addPlanet(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,  19.2184, 0.046, 30660, sun));
        solarSystem.addPlanet(new Planet("Neptune",0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun));

        System.out.println(solarSystem.toString());

        Planet venus = solarSystem.getPlanet("Venus");
        Planet earth = solarSystem.getPlanet("Earth");
        Planet mars = solarSystem.getPlanet("Mars");
        Planet jupiter = solarSystem.getPlanet("Jupiter");
        Planet saturn = solarSystem.getPlanet("Saturn");
        Planet uranus = solarSystem.getPlanet("Uranus");
        Planet neptune = solarSystem.getPlanet("Neptune"); */
        Planet planet1 = new Planet("Mækken", 5, 1, 1, 1, 1, null);
        Planet planet2 = new Planet("Slækken", 2, 1, 1, 1, 1, null);
        Planet planet3 = new Planet("Kækken", 8, 1, 1, 1, 1, null);
        ArrayList<Planet> planeter = new ArrayList<>();
        planeter.add(planet1);
        planeter.add(planet2);
        planeter.add(planet3);

        Collections.sort(planeter);



        System.out.println(planeter);



    }
}
