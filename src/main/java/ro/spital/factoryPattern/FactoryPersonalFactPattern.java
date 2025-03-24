package ro.spital.factoryPattern;

import ro.spital.models.TipPersonal;

public class FactoryPersonalFactPattern {
    public static PersonalSpitalPattern crearePersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case ASISTENT:
                return new Asistent(nume);
            case BRANCARDIER:
                return new Brancardier(nume);
            case MEDIC:
                return new Medic(nume);
            case FARMACIST:
                return new Farmacist(nume);
            default:
                throw new IllegalArgumentException("Tip de personal necunoscut!");
        }
    }
}
