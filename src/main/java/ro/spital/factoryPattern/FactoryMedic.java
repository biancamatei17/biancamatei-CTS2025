package ro.spital.factoryPattern;

public class FactoryMedic implements FactoryPersonalInterface {

    @Override
    public PersonalSpitalPattern crearePersonal(String nume) {
        return new Medic(nume);
    }
}
