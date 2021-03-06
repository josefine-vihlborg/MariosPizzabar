package mariospizza;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MariosPizzaProgram {
  ArrayList<Pizza> aktueltMenukort = new ArrayList<>();


  public static void main(String[] args) throws FileNotFoundException {
    MariosPizzaProgram mariosPizzaProgram = new MariosPizzaProgram();
    mariosPizzaProgram.run();
  }

  public void menukort() {
    Pizza pizza1 = new Pizza("Vesuvio", 1, 75);
    Pizza pizza2 = new Pizza("Amerikaner", 2, 80);
    Pizza pizza3 = new Pizza("Cacciatore", 3, 65);
    Pizza pizza4 = new Pizza("Carbona", 4, 70);
    Pizza pizza5 = new Pizza("Dennis", 5, 65);
    Pizza pizza6 = new Pizza("Bertil", 6, 68);
    Pizza pizza7 = new Pizza("Silvia", 7, 73);
    Pizza pizza8 = new Pizza("Toronfo", 8, 65);
    Pizza pizza9 = new Pizza("Victoria", 9, 61);
    Pizza pizza10 = new Pizza("Capricciosa", 10, 70);
    Pizza pizza11 = new Pizza("Hawai", 11, 72);
    Pizza pizza12 = new Pizza("Le Blissola", 12, 65);
    Pizza pizza13 = new Pizza("Venezia", 13, 60);
    Pizza pizza14 = new Pizza("Mafia", 14, 75);
    Pizza pizza15 = new Pizza("Viking", 15, 80);
    Pizza pizza16 = new Pizza("Salcicia", 16, 76);
    Pizza pizza17 = new Pizza("Venice", 17, 75);
    Pizza pizza18 = new Pizza("California", 18, 65);
    Pizza pizza19 = new Pizza("Heavy Man", 19, 62);
    Pizza pizza20 = new Pizza("Pomodoro", 20, 60);

    aktueltMenukort.add(pizza1);
    aktueltMenukort.add(pizza2);
    aktueltMenukort.add(pizza3);
    aktueltMenukort.add(pizza4);
    aktueltMenukort.add(pizza5);
    aktueltMenukort.add(pizza6);
    aktueltMenukort.add(pizza7);
    aktueltMenukort.add(pizza8);
    aktueltMenukort.add(pizza9);
    aktueltMenukort.add(pizza10);
    aktueltMenukort.add(pizza11);
    aktueltMenukort.add(pizza12);
    aktueltMenukort.add(pizza13);
    aktueltMenukort.add(pizza14);
    aktueltMenukort.add(pizza15);
    aktueltMenukort.add(pizza16);
    aktueltMenukort.add(pizza17);
    aktueltMenukort.add(pizza18);
    aktueltMenukort.add(pizza19);
    aktueltMenukort.add(pizza20);

    System.out.println("Menukort: ");
    for (int i = 0; i < aktueltMenukort.size(); i++) {
      System.out.println(aktueltMenukort.get(i).getNummer() + ". " +
          (aktueltMenukort.get(i).getPizzaNavn() +
              "\t" + aktueltMenukort.get(i).getPris()) + " kr.");
    }
  }

  public void run() throws FileNotFoundException {
    Scanner input = new Scanner(System.in);
    Ordrer ordrer = new Ordrer();
    OrdrerHistorik ordrerHistorik = new OrdrerHistorik();

    while (true) {
      System.out.println("");
      System.out.println("V??lg funktion ved, at indtaste det tilsvarende tal: ");
      System.out.println("1. Vis menukort.");
      System.out.println("2. Start ny ordre.");
      System.out.println("3. Vis alle ordrer.");
      System.out.println("4. Gem ordre historik i en fil.");
      System.out.println("5. Vis ordre historik fra en fil.");
      System.out.println("6. Afslut programmet.\n");
      System.out.print("Dit valg: ");
      int choice = input.nextInt();

      switch (choice) {
        case 1:
          menukort();
          break;
        case 2:
          ordrer.tilf??jOrdre();
          break;
        case 3:
          ordrer.ordreListe();
          break;
        case 4:
          ordrerHistorik.gemOrdrerHistorik(ordrer);
          break;
        case 5:
          ordrerHistorik.hentOrdrerHistorik();
          break;
        case 6:
          System.exit(0);
      }
    }
  }
}
