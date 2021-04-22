package mariospizza;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ordre {
  private String kundeNavn;
  private LocalDateTime datoTid;
  private ArrayList<Integer> pizzaNummerListe = new ArrayList<>();


  public Ordre(String kundeNavn, LocalDateTime datoTid, ArrayList<Integer> pizzaNummerListe) {
    this.pizzaNummerListe = pizzaNummerListe;
    this.kundeNavn = kundeNavn;
    this.datoTid = datoTid;
  }

  public void tilføjTilListe(int pizzaNummer){
    pizzaNummerListe.add(pizzaNummer);
  }


  public ArrayList<Integer> getPizzaNummerListe() {
    return pizzaNummerListe;
  }
  public void setPizzaNummerListe(ArrayList<Integer> pizzaNummerListe) {
    this.pizzaNummerListe = pizzaNummerListe;
  }

  public String getKundeNavn() {
    return kundeNavn;
  }
  public void setKundeNavn(String kundeNavn) {
    this.kundeNavn = kundeNavn;
  }

  public LocalDateTime getDatoTid() {
    return datoTid;
  }
  public void setDatoTid(LocalDateTime datoTid) {
    this.datoTid = datoTid;
  }
}
