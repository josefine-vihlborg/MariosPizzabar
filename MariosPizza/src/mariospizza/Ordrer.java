package mariospizza;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
  private ArrayList<Ordre> ordreListe = new ArrayList<>();

  public ArrayList<Ordre> getOrdreListe() {
    return ordreListe;
  }

  public void setOrdreListe(ArrayList<Ordre> ordreListe) {
    this.ordreListe = ordreListe;
  }

  public void tilføjOrdre() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Kundens navn: ");
    String kundeNavn = scan.nextLine();
    Ordre ordre = new Ordre(kundeNavn, LocalDateTime.now(), new ArrayList<Integer>());
    System.out.print("Indtast de pizzaer, som kunden ønsker én efter én: ");
    int tilføjNummer = -1;
    while (tilføjNummer != 0) {
      tilføjNummer = scan.nextInt();
      if (tilføjNummer > 0 && tilføjNummer <= 20) {
        System.out.print("Indtast en pizza mere: ");
        ordre.tilføjTilListe(tilføjNummer);
      } else if (tilføjNummer < 0 && tilføjNummer < 20) {
        System.out.print("Dette er ikke en pizza. Tast et nummer fra menuen: ");
      }
    }
    ordreListe.add(ordre);
    System.out.println("Antal igangværende ordrer: " + ordreListe.size());
  }


  public void ordreListe() {

    for (int i = 0; i < ordreListe.size(); i++) {
      LocalDateTime time = ordreListe.get(i).getDatoTid();
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-HH-yyyy HH:mm");
      Ordre temp = ordreListe.get(i);
      System.out.println("\nNavn: " + temp.getKundeNavn());
      System.out.println("Dato: " + time.format(fmt));
      System.out.println("Pizzaer bestilt: " + temp.getPizzaNummerListe());
    }
  }
}
