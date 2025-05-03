package ro.spital.memento;

public class OrigineRezultate {
    private String metodaLivrare;

    public void setareMetodaLivrare(String metodaLivrare) {
        this.metodaLivrare = metodaLivrare;
        System.out.println("Rezultatele vor fi livrate prin: " + metodaLivrare);
    }

    public StareRezultate salvareStare() {
        return new StareRezultate(metodaLivrare);
    }

    public void restaurareStare(StareRezultate stare) {
        this.metodaLivrare = stare.getMetodaLivrare();
        System.out.println("Starea anterioara a fost restaurata: " + metodaLivrare);
    }
}
