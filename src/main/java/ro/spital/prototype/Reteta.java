package ro.spital.prototype;

public class Reteta implements Prototype {
    private String nume;
    private String ingrediente;
    private double cantitate;

    public Reteta(String nume, String ingrediente, double cantitate) {
        this.nume = nume;
        this.ingrediente = ingrediente;
        this.cantitate = cantitate;
    }

    // Implementarea metodei clone
    @Override
    public Reteta clone() {
        return new Reteta(this.nume, this.ingrediente, this.cantitate);
    }

    // Metodă pentru afișare
    public void afiseazaReteta() {
        System.out.println("Reteta: " + nume + ", Ingrediente: " + ingrediente + ", Cantitate: " + cantitate);
    }
}


