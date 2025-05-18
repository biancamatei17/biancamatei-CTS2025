package ro.restaurant.facade;

public class ModulReceptionist {
    private VerificatorDisponibilitateMasa disponibilitate;
    private VerificatorDebarasare debarasare;
    private VerificatorServetele servetele;

    public ModulReceptionist() {
        this.disponibilitate = new VerificatorDisponibilitateMasa();
        this.debarasare = new VerificatorDebarasare();
        this.servetele = new VerificatorServetele();
    }

    public boolean poateFiOcupataMasa(int nrMasa) {
        return disponibilitate.esteMasaLibera(nrMasa)
                && debarasare.esteDebarasata(nrMasa)
                && servetele.areServetele(nrMasa);
    }
}
