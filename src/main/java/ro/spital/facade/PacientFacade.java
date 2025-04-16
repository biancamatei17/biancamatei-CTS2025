package ro.spital.facade;

public class PacientFacade {
    private String nume;
    private boolean stareGrava;

    public PacientFacade(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public boolean esteInStareGrava() {
        return stareGrava;
    }

    public String getNume() {
        return nume;
    }
}
