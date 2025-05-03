package ro.spital.templateMethod;

public class InternarePacientNormal extends TemplateInternare {
    @Override
    protected void analizeazaStare(String numePacientTemplate) {
        System.out.println("Se analizeaza starea obisnuita a pacientului " + numePacientTemplate);
    }
}
