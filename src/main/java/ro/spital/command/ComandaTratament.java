package ro.spital.command;

public class ComandaTratament implements IComanda{
    private MedicCommand medicCommand;
    private String numePacientCommand;

    public ComandaTratament(MedicCommand medicCommand, String numePacientCommand) {
        this.medicCommand = medicCommand;
        this.numePacientCommand = numePacientCommand;
    }

    @Override
    public void executa() {
        medicCommand.trateazaPacient(numePacientCommand);
    }
}
