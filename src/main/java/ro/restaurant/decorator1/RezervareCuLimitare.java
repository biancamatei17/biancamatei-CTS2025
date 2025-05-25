package ro.restaurant.decorator1;

public class RezervareCuLimitare implements IRezervarePersoane{
    private IRezervarePersoane rezervare;

    public RezervareCuLimitare(IRezervarePersoane rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(int nrPersoane) {
        if (nrPersoane >= 4) {
            rezervare.realizeazaRezervare(nrPersoane);
        } else {
            System.out.println("Rezervarile sunt acceptate doar pentru minim 4 persoane.");
            System.out.println("Va invitam sa veniti direct la restaurant pentru mesele de 2 persoane.");
        }
    }
}
