package ro.restaurant.composite;

public class ProdusMeniu implements IComponentaMeniu {
    private String denumire;

    public ProdusMeniu(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseaza(String indentare) {
        System.out.println(indentare + "- " + denumire);
    }
}
