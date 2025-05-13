package ro.restaurant.factoryMethod;

public class SupaDeVitaFactory implements IFelMancare{
    @Override
    public String getDenumire() {
        return "Supa de vita";
    }

    @Override
    public void servire() {
        System.out.println("Se serveste supa de vita.");
    }
}