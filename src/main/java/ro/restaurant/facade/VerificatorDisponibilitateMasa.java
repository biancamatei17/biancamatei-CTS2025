package ro.restaurant.facade;

public class VerificatorDisponibilitateMasa {
    public boolean esteMasaLibera(int nrMasa) {
        System.out.println("Se verifica daca masa " + nrMasa + " este libera...");
        return nrMasa % 2 == 0; // exemplu: mesele pare sunt libere
    }
}
