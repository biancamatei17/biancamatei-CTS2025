package ro.spital.composite;

public class Sectie implements IUnitateSpital {
    private String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaStructura(String indentare) {
        System.out.println(indentare + "- Sectie: " + denumire);
    }
}
