package ro.spital.state;

public class StareInternat implements IStarePacient {
    @Override
    public void afiseazaStare(String numePacientState) {
        System.out.println("Pacientul " + numePacientState + " este in starea: INTERNAT.");
    }
}
