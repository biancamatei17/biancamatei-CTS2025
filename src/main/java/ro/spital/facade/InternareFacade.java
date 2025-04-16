package ro.spital.facade;

public class InternareFacade {
    public void interneazaPacient(PacientFacade pacient, MedicFacade medic, Salon salon) {
        if (pacient.esteInStareGrava()) {
            if (medic.confirmaInternare(pacient)) {
                if (salon.arePaturiLibere()) {
                    salon.ocupaPat();
                    System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
                } else {
                    System.out.println("Nu sunt paturi libere.");
                }
            } else {
                System.out.println("Medicul nu a confirmat internarea.");
            }
        } else {
            System.out.println("Pacientul nu este în stare gravă.");
        }
    }
}
