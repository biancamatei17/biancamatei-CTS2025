package ro.spital.command;

public class MedicCommand {
    private String nume;

    public MedicCommand(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(String pacient) {
        System.out.println("Medicul " + nume + " a internat pacientul " + pacient);
    }

    public void trateazaPacient(String pacient) {
        System.out.println("Medicul " + nume + " a tratat imediat pacientul " + pacient);
    }
}
