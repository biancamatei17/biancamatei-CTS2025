package ro.spital.factoryPattern;

public class FactoryBrancardier implements FactoryPersonalInterface {
    @Override
    public PersonalSpitalPattern crearePersonal(String nume) {
        return new Brancardier(nume);
    }
}
