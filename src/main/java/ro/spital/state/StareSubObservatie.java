package ro.spital.state;

public class StareSubObservatie implements IStarePacient{
    @Override
    public void afiseazaStare(String numePacientState) {
        System.out.println("Pacientul " + numePacientState + " este in starea: SUB OBSERVATIE.");
    }
}
