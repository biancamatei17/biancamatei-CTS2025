package ro.spital.templateMethod;

public class InternarePacientCritic extends TemplateInternare{
    @Override
    protected void analizeazaStare(String numePacientTemplate) {
        System.out.println("ALERTA: Stare critica analizata pentru pacientul " + numePacientTemplate);
    }

    @Override
    protected void verificaDisponibilitateSalon() {
        System.out.println("Prioritate maxima - se cauta imediat salon disponibil!");
    }
}
