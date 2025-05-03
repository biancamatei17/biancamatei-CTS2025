package ro.spital.flyweight;

public class InternareFlyweight {
    private final PacientFlyweight pacient;
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public InternareFlyweight(PacientFlyweight pacient, int nrSalon, int nrPat, int nrZile) {
        this.pacient = pacient;
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    public void afiseazaInternare() {
        pacient.afiseazaInformatii();
        System.out.println("Internare: Salon " + nrSalon + ", Pat " + nrPat + ", Zile spitalizare: " + nrZile);
        System.out.println();
    }
}
