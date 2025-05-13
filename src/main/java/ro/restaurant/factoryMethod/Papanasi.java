package ro.restaurant.factoryMethod;

public class Papanasi implements IFelMancare{
    @Override
    public String getDenumire() {
        return "Papanasi";
    }

    @Override
    public void servire() {
        System.out.println("Se servesc papanasi.");
    }
}
