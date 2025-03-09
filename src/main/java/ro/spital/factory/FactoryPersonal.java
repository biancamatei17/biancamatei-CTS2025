package ro.spital.factory;

public class FactoryPersonal {
    public static PersonalSpital createPersonal(TipPersonal tip, String nume)
    {
        switch (tip)
        {
            case BRANCARDIER:
                return new Brancardier(nume);
            case ASISTENT:
                return new Asistent(nume);
            case MEDIC:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException("Tipul de personal este necunoscut!");
        }
    }
}
