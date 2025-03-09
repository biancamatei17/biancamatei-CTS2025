package ro.spital.factory;

public class Medic extends PersonalSpital{
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Medic: " + nume);
    }

}
