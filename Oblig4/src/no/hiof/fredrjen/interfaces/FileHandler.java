package no.hiof.fredrjen.interfaces;

import no.hiof.fredrjen.models.PlanetSystem;

public interface FileHandler {

    String getFile();

    int compareTo(PlanetSystem o);

    int writeObjectsToFile();
}
