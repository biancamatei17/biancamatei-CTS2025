package ro.spital.observer;
import java.util.ArrayList;
import java.util.List;

public class SpitalNotifier {
    private List<IObserverPacient> observatori = new ArrayList<>();

    public void aboneaza(IObserverPacient pacient) {
        observatori.add(pacient);
    }

    public void dezaboneaza(IObserverPacient pacient) {
        observatori.remove(pacient);
    }

    public void trimiteNotificare(String mesaj) {
        for (IObserverPacient pacient : observatori) {
            pacient.primesteNotificare(mesaj);
        }
    }
}
