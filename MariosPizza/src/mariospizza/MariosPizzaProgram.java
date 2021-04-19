package mariospizza;

import java.util.ArrayList;
import java.util.Scanner;

public class MariosPizzaProgram {
    ArrayList<Pizza> aktueltMenukort = new ArrayList<>();

    public static void main(String[] args) {
        new MariosPizzaProgram().menukort();
        new MariosPizzaProgram().run();
    }

    public void menukort(){
        Pizza pizza1 = new Pizza("Vesuvio", 1, 75);
        Pizza pizza2 = new Pizza("Amerikaner", 2, 80);

        aktueltMenukort.add(pizza1);
        aktueltMenukort.add(pizza2);

        System.out.println("Menukort: ");
        for (int i = 0; i<aktueltMenukort.size(); i++){
            System.out.println(aktueltMenukort.get(i).getNummer() + ". " +
                    (aktueltMenukort.get(i).getPizzaNavn() +
                        "\t" + aktueltMenukort.get(i).getPris()));
        }
    }

    public void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Vælg funktion: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                menukort();
                break;
            case 2:
                Ordrer ordrer = new Ordrer();
                ordrer.tilføjOrdre();
                break;
            case 3:
                //aktuelOrdreListe();
                break;
            case 4:
                //odrerHistorik();
                break;

        }
    }
}
