package ro.spital.adapter;

public class MedicamentAdapter implements IMedicament {
    private MedicamentFarmacie medicamentFarmacie;

    public MedicamentAdapter(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }
    @Override
    public void achizitioneazaMedicament() {
        medicamentFarmacie.cumparaMedicament();
    }
}
