package ro.spital.builder;

public class PacientBuilder{
    private String nume;
    private boolean patRabatabil = false;
    private boolean micDejunInclus= false;
    private boolean papuciCamera= false;
    private boolean halatInterior=false;

    // Constructor care primeste numele pacientului
    // fiecare metoda seteaza o anumita facilitate si returneaza instanta curenta (this) permitand
    //apeluri in lant.
    public PacientBuilder(String nume){
        this.nume=nume;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    public Pacient build()
    {
        return new Pacient (nume, patRabatabil, micDejunInclus,papuciCamera, halatInterior);
    }
}