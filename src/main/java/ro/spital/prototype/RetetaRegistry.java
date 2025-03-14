package ro.spital.prototype;

import java.util.HashMap;
import java.util.Map;

public class RetetaRegistry {
    private Map<String, Reteta> retete = new HashMap<>();

    public void adaugaReteta(String nume, Reteta reteta) {
        retete.put(nume, reteta);
    }

    public Reteta obtineReteta(String nume) {
        Reteta reteta = retete.get(nume);
        return (reteta != null) ? reteta.clone() : null;
    }
}
