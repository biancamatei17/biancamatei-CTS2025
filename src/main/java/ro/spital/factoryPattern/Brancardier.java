package ro.spital.factoryPattern;

public class Brancardier extends PersonalSpitalPattern {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier: "+ nume);
    }
}
