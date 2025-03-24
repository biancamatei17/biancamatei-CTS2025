package ro.spital.prototypeC4;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements IRetetaPrototype {
    private String numeMedicament;
    private Map<String, Double> ingrediente;  // Ingrediente și cantități

    public RetetaMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
        this.ingrediente = new HashMap<>();
    }

    public void adaugaIngredient(String ingredient, double cantitate) {
        this.ingrediente.put(ingredient, cantitate);
    }

    @Override
    public IRetetaPrototype clone() {
        RetetaMedicament retetaNoua2 = new RetetaMedicament(this.numeMedicament);
        retetaNoua2.ingrediente = new HashMap<>(this.ingrediente); // Copiem ingredientele
        return retetaNoua2;
    }

    public void afisareReteta() {
        System.out.println("Rețetă pentru: " + numeMedicament);
        for (Map.Entry<String, Double> entry : ingrediente.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " mg");
        }
    }
}
