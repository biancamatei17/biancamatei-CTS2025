package ro.spital.command;

public class ComandaInternare implements IComanda{

    private MedicCommand medicCommand;
    private String numePacientCommand;

    public ComandaInternare(MedicCommand medicCommand, String numePacientCommand) {
        this.medicCommand = medicCommand;
        this.numePacientCommand = numePacientCommand;
    }


    @Override
    public void executa() {
        medicCommand.interneazaPacient(numePacientCommand);
    }
}
