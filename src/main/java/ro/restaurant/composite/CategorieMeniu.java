package ro.restaurant.composite;

import java.util.ArrayList;
import java.util.List;

public class CategorieMeniu implements IComponentaMeniu {
    private String denumire;
    private List<IComponentaMeniu> componente = new ArrayList<>();

    public CategorieMeniu(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaComponenta(IComponentaMeniu componenta) {
        componente.add(componenta);
    }

    public void stergeComponenta(IComponentaMeniu componenta) {
        componente.remove(componenta);
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + denumire + ":");
        for (IComponentaMeniu comp : componente) {
            comp.afiseaza(indentare + "   ");
        }
    }
}
