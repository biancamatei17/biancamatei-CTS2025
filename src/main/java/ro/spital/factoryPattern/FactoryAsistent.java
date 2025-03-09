package ro.spital.factoryPattern;

public class FactoryAsistent implements FactoryPersonalInterface {
    @Override
    public PersonalSpitalPattern crearePersonal(String nume) {
        return new Asistent(nume);
    }
}
