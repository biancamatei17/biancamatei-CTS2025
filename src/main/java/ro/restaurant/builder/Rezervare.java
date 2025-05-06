package ro.restaurant.builder;

public class Rezervare {
    private final boolean asezareLaGeam;
    private final boolean scauneErgonomice;
    private final boolean decorareMasa;
    private final boolean muzicaAmbientala;
    private final String genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice,
                     boolean decorareMasa, boolean muzicaAmbientala,
                     String genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void afiseazaDetalii() {
        System.out.println("Rezervare:");
        System.out.println("- Așezare la geam: " + asezareLaGeam);
        System.out.println("- Scaune ergonomice: " + scauneErgonomice);
        System.out.println("- Decorare masă: " + decorareMasa);
        System.out.println("- Muzică ambientală: " + muzicaAmbientala);
        System.out.println("- Gen muzică: " + (genMuzica != null ? genMuzica : "niciunul"));
    }
}
