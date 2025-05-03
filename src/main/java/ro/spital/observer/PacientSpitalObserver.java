package ro.spital.observer;

public class PacientSpitalObserver implements IObserverPacient{
    private String nume;

    public PacientSpitalObserver(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + nume + " a primit notificarea: " + mesaj);
    }
}
