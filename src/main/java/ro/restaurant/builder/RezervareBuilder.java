package ro.restaurant.builder;

public class RezervareBuilder {
    private boolean asezareLaGeam = false;
    private boolean scauneErgonomice = false;
    private boolean decorareMasa = false;
    private boolean muzicaAmbientala = false;
    private String genMuzica = null;

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public Rezervare build() {
        return new Rezervare(asezareLaGeam, scauneErgonomice, decorareMasa, muzicaAmbientala, genMuzica);
    }
}
