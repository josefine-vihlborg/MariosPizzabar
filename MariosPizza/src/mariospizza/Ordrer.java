package mariospizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Ordrer {
    ArrayList<ArrayList> ordreliste = new ArrayList<>();

    public void tilføjOrdre() {
        // MariosPizzaProgram exitObject = new MariosPizzaProgram();
        System.out.print("Afgiv din bestilling og skriv numrene på de pizzaer du vil bestille: ");
        ArrayList<Integer> ordre = new ArrayList<>();
        int tilføjNummer = -1;
        while (tilføjNummer != 0) {
            Scanner scan = new Scanner(System.in);
            tilføjNummer = scan.nextInt();
            if (tilføjNummer > 0 && tilføjNummer <= 20) {
                System.out.print("Indtast en pizza mere: ");
                ordre.add(tilføjNummer);
            }
            //exitObject.run(); // Sådan at man ryger tilbage til program menuen.
            else if (tilføjNummer < 0 && tilføjNummer < 20){
                System.out.print("Dette er ikke en pizza. Tast et nummer fra menuen: ");
            }
        }
        ordreliste.add(ordre);
        System.out.println(ordreliste.size());
        }
        public void ordreListe () {
            for (int i = 0; i < ordreliste.size(); i++) {
                ArrayList<ArrayList> temp = ordreliste.get(i);
                for (int j = 0; j < temp.size(); j++) {
                    System.out.println(temp.get(j));
                }
            }
        }
    }
