package no.hiof.fredrjen.forelesning16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String lestTekst = "";
        System.out.println("Skriv tekst her (skriv 'avslutt' for å avslutte):");




        try(

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fileWriter = new FileWriter("frainput.txt", true);

                ) {


            while (!lestTekst.equals("avslutt")) {
                   // logikk for å ta imot input så lenge "avslutt" ikke blir skrevet

           // while (lestTekst.equals("avslutt") != false) {
                System.out.println(": ");

                //bufferedreader venter med å "lese" til vi har en hel linje tekst
                lestTekst = bufferedReader.readLine();


                fileWriter.append(lestTekst + "\n");


            }




        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }/*
        finally {

            fileWriter.close();
            bufferedReader.close();
        }*/
    }
}
