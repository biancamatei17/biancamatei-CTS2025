package ro.spital.builder;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCameral;
    private boolean halatInterior;

    // Constructor care primeste toate valorile si le seteaza

    public Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciCameral, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCameral = papuciCameral;
        this.halatInterior = halatInterior;
    }

    // Metoda String pentru afisarea obiectului sub forma de text


    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Pacient{");
        stringBuilder.append("nume='").append(nume).append('\'');
        stringBuilder.append(", patRabatabil=").append(patRabatabil);
        stringBuilder.append(", micDejunInclus=").append(micDejunInclus);
        stringBuilder.append(", papuciCameral=").append(papuciCameral);
        stringBuilder.append(", halatInterior=").append(halatInterior);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    // Constructorul are toti parametrii necesari pentru a initializa un pacient.
    // Daca nu folosim un builder, trebuie sa trecem explicit false pentru optiunile pe care pacientul
    // nu le alege.
}