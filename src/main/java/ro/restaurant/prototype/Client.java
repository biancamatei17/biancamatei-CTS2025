package ro.restaurant.prototype;

public class Client implements Cloneable {
    private String nume;
    private String email;
    private String telefon;

    public Client(String nume, String email, String telefon) {
        System.out.println("Creare Client:");
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    public void afiseazaDetalii() {
        System.out.println("Client: " + nume + ", Email: " + email + ", Telefon: " + telefon);
    }

    @Override
    public Client clone() {
        try {
            return (Client) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Nu se poate clona obiectul Client.", e);
        }
    }
}