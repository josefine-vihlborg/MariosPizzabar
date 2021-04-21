package mariospizza;

import java.time.LocalDateTime;

public class Ordre {
  private String kundeNavn;
  private LocalDateTime datoTid;

  public Ordre(String kundeNavn, LocalDateTime datoTid) {
    this.kundeNavn = kundeNavn;
    this.datoTid = datoTid;
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
