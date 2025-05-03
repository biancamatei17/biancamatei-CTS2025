package ro.spital.memento;

public class MemorieRezultate {
    private StareRezultate stareSalvata;

    public void salvareStare(StareRezultate stare) {
        this.stareSalvata = stare;
    }

    public StareRezultate getStareSalvata() {
        return stareSalvata;
    }
}
