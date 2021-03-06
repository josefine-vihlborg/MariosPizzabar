package mariospizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OrdrerHistorik {
  private File file = new File("ordreHistorik.txt");

  public void gemOrdrerHistorik(Ordrer ordrer) throws FileNotFoundException {
    System.out.println("Ordrehistorikken er nu gemt.");
    PrintStream output = new PrintStream(new FileOutputStream(file, true));
    for (int i = 0; i < ordrer.getOrdreListe().size(); i++) {
      output.append(ordrer.getOrdreListe().get(i).getKundeNavn() + " ");
      output.append(ordrer.getOrdreListe().get(i).getDatoTid().toString() + " ");
      output.append(ordrer.getOrdreListe().get(i).getPizzaNummerListe().toString() + "\n");
    }
    output.close();
  }

  public void hentOrdrerHistorik() throws FileNotFoundException {
    System.out.println("Totale ordrer historik:");
    Scanner fileReader = new Scanner(file);
    while (fileReader.hasNext()) {
      System.out.println(fileReader.nextLine());
    }
  }
}
