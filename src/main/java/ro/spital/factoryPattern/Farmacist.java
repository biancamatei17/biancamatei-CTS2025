package ro.spital.factoryPattern;

public class Farmacist extends PersonalSpitalPattern{

    public Farmacist(String nume) {
        super(nume);
    }
    @Override
    public void descriere() {
        {
            System.out.println("Farmacist: "+ nume);
        }
    }
}
