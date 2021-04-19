package mariospizza;

public class Pizza {
    private String pizzaNavn;
    private int nummer;
    private int pris;

    public Pizza(String pizzaNavn, int nummer, int pris) {
        setPizzaNavn(pizzaNavn);
        setNummer(nummer);
        setPris(pris);
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
    public int getNummer() {
        return nummer;
    }


    public void setPizzaNavn(String pizzaNavn) {
        this.pizzaNavn = pizzaNavn;
    }
    public String getPizzaNavn() {
        return pizzaNavn;
    }



    public void setPris(int pris) {
        this.pris = pris;
    }
    public int getPris() {
        return pris;
    }
}
