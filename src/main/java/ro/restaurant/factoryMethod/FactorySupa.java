package ro.restaurant.factoryMethod;

import ro.restaurant.factory.SupaDeLegume;
import ro.restaurant.factory.SupaDeVita;

public class FactorySupa extends FactoryFelDeMancare {
    @Override
    public IFelMancare createFelMancare(String tip) {
        switch (tip.toLowerCase()) {
            case "ciuperci": return new SupaDeCiuperciFactory();
            case "legume": return new SupaDeLegumeFactory();
            case "vita": return new SupaDeVitaFactory();
            default: throw new IllegalArgumentException("Tip supă necunoscut: " + tip);
        }
    }
}
