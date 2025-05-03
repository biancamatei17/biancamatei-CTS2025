package ro.spital.state;

public class StareExternat implements IStarePacient{
    @Override
    public void afiseazaStare(String numePacientState) {
        System.out.println("Pacientul " + numePacientState + " este in starea: EXTERNAT.");
    }
}
