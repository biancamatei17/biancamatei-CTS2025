package ro.restaurant.factoryMethod;

public class SupaDeCiuperci implements IFelMancare{
    @Override
    public String getDenumire() {
        return "Supa de ciuperci";
    }

    @Override
    public void servire() {
        System.out.println("Se serveste supa de ciuperci.");
    }
}
