package ro.spital.factoryPattern;

public class FactoryFarmacist implements FactoryPersonalInterface {

    @Override
    public PersonalSpitalPattern crearePersonal(String nume) {
        return new Farmacist(nume);
    }
}
