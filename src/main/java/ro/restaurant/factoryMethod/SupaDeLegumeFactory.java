package ro.restaurant.factoryMethod;

public class SupaDeLegume implements IFelMancare{
    @Override
    public String getDenumire() {
        return "Supa de legume";
    }

    @Override
    public void servire() {
        System.out.println("Se serveste supa de legume.");
    }
}