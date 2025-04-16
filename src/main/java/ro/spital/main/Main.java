package ro.spital.main;
import ro.spital.adapter.IMedicament;
import ro.spital.adapter.MedicamentAdapter;
import ro.spital.adapter.MedicamentFarmacie;
import ro.spital.builder.Pacient;
import ro.spital.builder.PacientBuilder;
import ro.spital.factory.FactoryPersonal;
import ro.spital.factory.PersonalSpital;
import ro.spital.factoryPattern.*;
import ro.spital.models.TipPersonal;
import ro.spital.prototype.Reteta;
import ro.spital.prototype.RetetaRegistry;
import ro.spital.factoryPattern.FactoryPersonalFactPattern;
import ro.spital.prototypeC4.RetetaMedicament;

public class Main {
    public static void main(String[] args) {
        // Builder
        // Am creat un pacient cu pat rabatabil si mic dejun inclus
        Pacient pacient1= new PacientBuilder("Ion Popescu")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();

        // Pacient fara facilitati extra
        Pacient pacient2= new PacientBuilder ("Maria Ionescu").build();


        // Afisare

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

        System.out.println ();
        // Factory
        PersonalSpital brancardier = FactoryPersonal.createPersonal(ro.spital.factory.TipPersonal.BRANCARDIER, "Ion Popescu");
        PersonalSpital asistent = FactoryPersonal.createPersonal(ro.spital.factory.TipPersonal.ASISTENT,"Maria Ionescu");
        PersonalSpital medic = FactoryPersonal.createPersonal(ro.spital.factory.TipPersonal.MEDIC,"Vasile Georgescu");

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();

        System.out.println ();

    // Factory Pattern

        PersonalSpitalPattern asistent1 = FactoryPersonalFactPattern.crearePersonal(TipPersonal.ASISTENT, "Ion Popescu");
        PersonalSpitalPattern medic1 = FactoryPersonalFactPattern.crearePersonal(TipPersonal.MEDIC, "Maria Ionescu");

        asistent.descriere();
        medic.descriere();

        System.out.println ();
        // prototype

        // Inițializam registry-ul
        RetetaRegistry registry = new RetetaRegistry();

        // Cream o reteta si o adaugam in registry
        Reteta reteta1 = new Reteta("Antibiotic", "Substanta X, Substanta Y", 5.0);
        registry.adaugaReteta("Antibiotic", reteta1);

        // Obtinem o copie a retetei fara a apela constructorul
        Reteta retetaCopiata = registry.obtineReteta("Antibiotic");

        // Afisam reteta copiata
        if (retetaCopiata != null) {
            retetaCopiata.afiseazaReteta();
        } else {
            System.out.println("Reteta nu a fost gasita.");
        }

        System.out.println ();

        //Prototype Cerinta 4 (C4)
        // Cream o reteta initiala
        RetetaMedicament retetaOriginala2 = new RetetaMedicament("Paracetamol");
        retetaOriginala2.adaugaIngredient("Paracetamol", 500.0);
        retetaOriginala2.adaugaIngredient("Zaharina", 10.0);

        System.out.println("Reteta Originala:");
        retetaOriginala2.afisareReteta();

        // Clonăm reteta
        RetetaMedicament retetaCopiata2 = (RetetaMedicament) retetaOriginala2.clone();
        System.out.println("\nReteta Clonata:");
        retetaCopiata2.afisareReteta();

        // Modificam reteta clonata si verific ca nu afecteaza originalul
        retetaCopiata2.adaugaIngredient("Vitamina C", 50.0);
        System.out.println("\nReteta modificata dupa clonare:");
        retetaCopiata2.afisareReteta();

        System.out.println("\nReteta originala ramane neschimbata:");
        retetaOriginala2.afisareReteta();
        System.out.println();
        // Cernta 5

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        IMedicament medicament = new MedicamentAdapter(medicamentFarmacie);

        medicament.achizitioneazaMedicament();

        // Cerinta 6 - Facade
        System.out.println();

        ro.spital.facade.PacientFacade pacientInternat = new ro.spital.facade.PacientFacade("Adrian Pop", true);
        ro.spital.facade.MedicFacade medicInternare = new ro.spital.facade.MedicFacade();
        ro.spital.facade.Salon salon = new ro.spital.facade.Salon(2);

        ro.spital.facade.InternareFacade internare = new ro.spital.facade.InternareFacade();
        internare.interneazaPacient(pacientInternat, medicInternare, salon);


    }
}


