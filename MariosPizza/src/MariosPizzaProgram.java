import java.util.ArrayList;
import java.util.Scanner;

public class MariosPizzaProgram {
    public static void main(String[] args) {
        new MariosPizzaProgram().menukort();

        run();
    }


    public void menukort(){
        ArrayList<Pizza> aktueltMenukort = new ArrayList<>();

        Pizza pizza1 = new Pizza("Vesuvio", 1, 75);
        Pizza pizza2 = new Pizza("Amerikaner", 2, 80);

        aktueltMenukort.add(pizza1);
        aktueltMenukort.add(pizza2);

        System.out.println("Menukort: ");
        for (int i = 0; i<aktueltMenukort.size(); i++){
            System.out.println(aktueltMenukort.get(i).getNummer() + ". " +
                    (aktueltMenukort.get(i).getPizzaNavn() + "\t" + aktueltMenukort.get(i).getPris()));
        }
    }

    public void run(){
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch (choice){
            case 1:
                menukort();
                break;
            case 2:
                tilføjOrdre();
                break;
            case 3:
                aktuelOrdreListe();
                break;
            case 4:
                odrerHistorik();
                break;

        }
    }
}
