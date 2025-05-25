package ro.restaurant.flyweight;

public class ClientFly {
    private final String nume;
    private final String telefon;
    private final String email;

    public ClientFly(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    public void afiseazaInformatii() {
        System.out.println("Client: " + nume + ", Tel: " + telefon + ", Email: " + email);
    }
}
