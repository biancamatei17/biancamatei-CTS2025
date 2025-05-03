package ro.spital.Strategy;

public class PlataCash implements IModPlata {
    @Override
    public void plateste(String numePacient, double suma) {
        System.out.println("Pacientul " + numePacient + " a platit " + suma + " RON cash.");
    }
}
