package mariospizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
    private ArrayList<Ordre> ordreListe = new ArrayList<>();
    private File file = new File("ordreHistorik.txt");
    private Scanner scan = new Scanner(System.in);

    public void tilføjOrdre() {
        System.out.print("Kundens navn: ");
        String kundeNavn = scan.nextLine();
        Ordre ordre = new Ordre(kundeNavn, LocalDateTime.now(),new ArrayList<Integer>());
        System.out.print("Indtast de pizzaer, som kunden ønsker én efter én: ");
        int tilføjNummer = -1;
        while (tilføjNummer != 0) {
            tilføjNummer = scan.nextInt();
            if (tilføjNummer > 0 && tilføjNummer <= 20) {
                System.out.print("Indtast en pizza mere: ");
                ordre.tilføjTilListe(tilføjNummer);
            }
            else if (tilføjNummer < 0 && tilføjNummer < 20){
                System.out.print("Dette er ikke en pizza. Tast et nummer fra menuen: ");
            }
        }
        ordreListe.add(ordre);
        System.out.println("Antal igangværende ordrer: " + ordreListe.size());
    }


    public void ordreListe(){

        for (int i = 0; i < ordreListe.size(); i++){
            LocalDateTime time = ordreListe.get(i).getDatoTid();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-HH-yyyy HH:mm");
            Ordre temp = ordreListe.get(i);
            System.out.println("\nNavn: " + temp.getKundeNavn());
            System.out.println("Dato: " + time.format(fmt));
            System.out.println("Pizzaer bestilt: " + temp.getPizzaNummerListe() + "\n");
        }
    }

    public void gemOrdrerHistorik() throws FileNotFoundException {
        System.out.println("Ordrehistorikken er nu gemt.");
        PrintStream output = new PrintStream(file);
        for (int i = 0; i < ordreListe.size(); i++){
            output.println(ordreListe.get(i).getKundeNavn());
            output.println(ordreListe.get(i).getDatoTid());
            output.println(ordreListe.get(i).getPizzaNummerListe());
        }
    }

    public void visOrdrerHistorik() throws FileNotFoundException {
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext()){
            System.out.println(fileReader.nextLine());
        }
    }
}
