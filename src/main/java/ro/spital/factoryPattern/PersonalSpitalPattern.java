package ro.spital.factoryPattern;

public abstract class PersonalSpitalPattern {
    protected String nume;

    public PersonalSpitalPattern(String nume) {
        this.nume = nume;
    }

    public abstract void descriere();
}
