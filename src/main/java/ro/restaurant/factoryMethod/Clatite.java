package ro.restaurant.factoryMethod;

public class Clatite implements IFelMancare{
    @Override
    public String getDenumire() {
        return "Clatite";
    }

    @Override
    public void servire() {
        System.out.println("Se servesc clatite.");
    }
}
