package ro.spital.facade;

public class MedicFacade {
    public boolean confirmaInternare(PacientFacade pacient) {
        System.out.println("Medicul confirmă internarea pentru " + pacient.getNume());
        return true;
    }
}
