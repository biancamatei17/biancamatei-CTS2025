package ro.restaurant.factory;

public class SupaFactory {
    public static ISupa creazaSupa(ETipSupa tip) {
        return switch (tip) {
            case SUPA_DE_LEGUME -> new SupaDeLegume();
            case SUPA_DE_CIUPERCI -> new SupaDeCiuperci();
            case SUPA_DE_VITA -> new SupaDeVita();
        };
    }
}
