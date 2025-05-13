package ro.restaurant.factoryMethod;

public class Cheescake implements IFelMancare {
    @Override
    public String getDenumire() {
        return "Cheesecake";
    }

    @Override
    public void servire() {
        System.out.println("Se serveste cheesecake.");
    }
}
