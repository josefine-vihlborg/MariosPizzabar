package mariospizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
  ArrayList<ArrayList> ordreliste = new ArrayList<>();

  public void tilføjOrdre() {
    System.out.print("Afgiv din bestilling og skriv numrene på de pizzaer du vil bestille: ");
    ArrayList<Integer> ordre = new ArrayList<>();
    while (true) {
      Scanner scan = new Scanner(System.in);
      int tilføjNummer = scan.nextInt();
      if (tilføjNummer > 0 && tilføjNummer <= 20) {
        System.out.print("Indtast en pizza mere: ");
        ordre.add(tilføjNummer);

      } else if (tilføjNummer == 0) {
        ordreliste.add(ordre);
        for (int i = 0; i < ordre.size(); i++) {
          System.out.println(ordre.get(i));
        }
        //break
      } else {
        System.out.print("Dette er ikke en pizza. Tast et nummer fra menuen: ");
      }
      }
    }
  public void ordreListe() {

  }
}