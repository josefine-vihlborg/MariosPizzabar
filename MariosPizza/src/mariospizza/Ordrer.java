package mariospizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
  ArrayList<Integer> ordrer = new ArrayList<>();

  public void tilføjOrdre() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Afgiv din bestilling og skriv numrene på de pizzaer du vil bestille: ");
    int tilføjNummer = scan.nextInt();
    //while ()
    ordrer.add(17);

    /*
    for (int i = 0; i < program.aktueltMenukort.size(); i++) {
      if (tilføjNummer == i) {
        ordrer.add(program.aktueltMenukort.get(i));
        System.out.println("Hej");
      } else {
        System.out.println("Hej 2");
      }
    }
    */

  }
}
