package ro.spital.factory;

public class Asistent extends PersonalSpital{
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Asistent: " + nume);
    }
}
