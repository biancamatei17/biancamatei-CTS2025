package ro.restaurant.facade;

public class VerificatorDebarasare {
    public boolean esteDebarasata(int nrMasa) {
        System.out.println("Se verifica daca masa " + nrMasa + " este debarasata...");
        return nrMasa % 3 != 0; // exemplu: mesele multiplu de 3 nu sunt debarasate
    }
}
