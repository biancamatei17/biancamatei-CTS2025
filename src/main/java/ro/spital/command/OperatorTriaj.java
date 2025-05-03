package ro.spital.command;
import java.util.ArrayList;
import java.util.List;

public class OperatorTriaj {
    private List<IComanda> coadaComenzi = new ArrayList<>();

    public void adaugaComanda(IComanda comanda) {
        coadaComenzi.add(comanda);
    }

    public void proceseazaComenzi() {
        for (IComanda comanda : coadaComenzi) {
            comanda.executa();
        }
        coadaComenzi.clear();
    }
}