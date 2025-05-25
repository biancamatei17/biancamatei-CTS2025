package ro.restaurant.flyweight;

public class RezervareFly {
    private final int masa;
    private final int nrPersoane;
    private final String ora;

    public RezervareFly(int masa, int nrPersoane, String ora) {
        this.masa = masa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public void afiseaza(ClientFly clientFly) {
        clientFly.afiseazaInformatii();
        System.out.println("Masa: " + masa + ", Nr. persoane: " + nrPersoane + ", Ora: " + ora);
        System.out.println();
    }
}
