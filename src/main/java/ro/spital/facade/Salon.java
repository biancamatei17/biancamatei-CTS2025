package ro.spital.facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> paturi; // true = ocupat, false = liber

    public Salon(int numarPaturi) {
        paturi = new ArrayList<>();
        for (int i = 0; i < numarPaturi; i++) {
            paturi.add(false);
        }
    }

    public boolean arePaturiLibere() {
        return paturi.contains(false);
    }

    public void ocupaPat() {
        for (int i = 0; i < paturi.size(); i++) {
            if (!paturi.get(i)) {
                paturi.set(i, true);
                System.out.println("Patul " + (i + 1) + " a fost ocupat.");
                return;
            }
        }
    }
}
