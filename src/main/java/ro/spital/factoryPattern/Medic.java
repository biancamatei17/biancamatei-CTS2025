package ro.spital.factoryPattern;

public class Medic extends PersonalSpitalPattern {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Medic: "+ nume);
    }
}
