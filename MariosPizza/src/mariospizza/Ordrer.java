package mariospizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
  ArrayList<Pizza> ordrer = new ArrayList<>();

  public void tilføjOrdre() {
    Scanner scan = new Scanner(System.in);
    MariosPizzaProgram program = new MariosPizzaProgram();

    System.out.print("Skriv nummeret på den pizza du ønsker: ");
    int tilføjNummer = scan.nextInt();

    for (int i = 1; i < program.aktueltMenukort.size(); i++) {
      if (tilføjNummer == i) {
        //ordrer.add(program.aktueltMenukort.get(i));
        System.out.println("Hej");
      }else {
        System.out.println("Hej 2");
      }
    }


  }
}
