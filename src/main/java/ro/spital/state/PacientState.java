package ro.spital.state;

public class PacientState {
    private String nume;
    private IStarePacient stare;

    public PacientState(String nume) {
        this.nume = nume;
        this.stare = new StareInternat(); // stare initiala
    }

    public void setStare(IStarePacient stareNoua) {
        this.stare = stareNoua;
    }

    public void afiseazaStare() {
        stare.afiseazaStare(nume);
    }
}
