package ro.spital.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IUnitateSpital {
    private String denumire;
    private List<IUnitateSpital> subunitati = new ArrayList<>();

    public Departament(String denumire) {
        this.denumire = denumire;
    }

    public void adauga(IUnitateSpital unitate) {
        subunitati.add(unitate);
    }

    public void sterge(IUnitateSpital unitate) {
        subunitati.remove(unitate);
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + " Departament: " + denumire);
        for (IUnitateSpital unitate : subunitati) {
            unitate.afiseazaStructura(indentare + "   ");
        }
    }
}
