package ro.spital.proxy;

public class PacientProxy implements IInternare{
    private Internare internare;
    private boolean areAsigurare;

    private String numePacientProxy;

    public PacientProxy(String numePacientProxy, boolean areAsigurare) {
        this.numePacientProxy = numePacientProxy;
        this.areAsigurare = areAsigurare;
        this.internare = new Internare();
    }

    @Override
    public void interneaza() {
        if (areAsigurare) {
            internare.interneaza(numePacientProxy);
        } else {
            System.out.println("Pacientul " + numePacientProxy + " NU poate fi internat - lipsa asigurare medicala.");
        }
    }
}
