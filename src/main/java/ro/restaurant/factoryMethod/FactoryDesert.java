package ro.restaurant.factoryMethod;

public class FactoryDesert extends FactoryFelDeMancare {
    @Override
    public IFelMancare createFelMancare(String tip) {
        switch (tip.toLowerCase()) {
            case "papanasi": return new Papanasi();
            case "clatite": return new Clatite();
            case "cheesecake": return new Cheesecake();
            default: throw new IllegalArgumentException("Tip desert necunoscut: " + tip);
        }
    }
}