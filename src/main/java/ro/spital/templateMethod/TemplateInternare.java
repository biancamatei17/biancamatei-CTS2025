package ro.spital.templateMethod;

public abstract class TemplateInternare {

    public final void proceseazaInternare(String numePacientTemplate) {
        analizeazaStare(numePacientTemplate);
        verificaDisponibilitateSalon();
        emiteFisaInternare(numePacientTemplate);
    }

    protected abstract void analizeazaStare(String numePacientTemplate);

    protected void verificaDisponibilitateSalon() {
        System.out.println("Se verifica disponibilitatea in saloanele spitalului...");
    }

    protected void emiteFisaInternare(String numePacientTemplate) {
        System.out.println("Se emite fisa de internare pentru pacientul " + numePacientTemplate);
    }
}
