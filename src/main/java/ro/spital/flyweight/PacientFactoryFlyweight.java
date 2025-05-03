package ro.spital.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PacientFactoryFlyweight {
    private Map<String, PacientFlyweight> pacienti = new HashMap<>();

    public PacientFlyweight getPacient(String nume, String telefon, String adresa) {
        String cheie = nume + "_" + telefon + "_" + adresa;
        if (!pacienti.containsKey(cheie)) {
            pacienti.put(cheie, new PacientFlyweight(nume, telefon, adresa));
        }
        return pacienti.get(cheie);
    }

    public int getNumarPacientiUnici() {
        return pacienti.size();
    }
}
