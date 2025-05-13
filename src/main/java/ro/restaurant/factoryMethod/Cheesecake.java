package ro.restaurant.factoryMethod;

public class Cheesecake implements IFelMancare {
    @Override
    public String getDenumire() {
        return "Cheesecake";
    }

    @Override
    public void servire() {
        System.out.println("Se serveste cheesecake.");
    }
}
