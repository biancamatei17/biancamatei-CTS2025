package ro.restaurant.decorator1;

public class RezervarePersoaneStandard implements IRezervarePersoane{
    @Override
    public void realizeazaRezervare(int nrPersoane) {
        System.out.println("Rezervare inregistrata pentru " + nrPersoane + " persoane.");
    }
}
