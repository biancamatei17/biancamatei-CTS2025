package ro.spital.Strategy;

public class ContextPlata {
    private IModPlata strategie;

    public void setStrategie(IModPlata strategie) {
        this.strategie = strategie;
    }

    public void efectueazaPlata(String numePacient, double suma) {
        if (strategie != null) {
            strategie.plateste(numePacient, suma);
        } else {
            System.out.println("Eroare: Nu a fost setata nicio metoda de plata.");
        }
    }
}
