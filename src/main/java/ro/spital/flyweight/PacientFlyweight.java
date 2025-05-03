package ro.spital.flyweight;

public class PacientFlyweight {
    private final String nume;
    private final String telefon;
    private final String adresa;

    public PacientFlyweight(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public void afiseazaInformatii() {
        System.out.println("Pacient: " + nume + ", Telefon: " + telefon + ", Adresa: " + adresa);
    }
}