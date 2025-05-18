package ro.restaurant.facade;

public class VerificatorServetele {
    public boolean areServetele(int nrMasa) {
        System.out.println("Se verifica daca masa " + nrMasa + " are servetele...");
        return nrMasa % 5 != 0; // ex: mesele multiplu de 5 nu au servetele
    }
}
