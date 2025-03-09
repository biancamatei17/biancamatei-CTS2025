package ro.spital.factoryPattern;

public class Asistent extends PersonalSpitalPattern {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Asistent: "+ nume);
    }
}
