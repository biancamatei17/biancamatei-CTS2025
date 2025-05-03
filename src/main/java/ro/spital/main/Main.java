package ro.spital.main;
import ro.spital.Strategy.ContextPlata;
import ro.spital.Strategy.PlataCard;
import ro.spital.Strategy.PlataCash;
import ro.spital.adapter.IMedicament;
import ro.spital.adapter.MedicamentAdapter;
import ro.spital.adapter.MedicamentFarmacie;
import ro.spital.builder.Pacient;
import ro.spital.builder.PacientBuilder;
import ro.spital.command.ComandaInternare;
import ro.spital.command.ComandaTratament;
import ro.spital.command.MedicCommand;
import ro.spital.command.OperatorTriaj;
import ro.spital.composite.Departament;
import ro.spital.factory.FactoryPersonal;
import ro.spital.factory.PersonalSpital;
import ro.spital.factoryPattern.*;
import ro.spital.flyweight.InternareFlyweight;
import ro.spital.flyweight.PacientFactoryFlyweight;
import ro.spital.flyweight.PacientFlyweight;
import ro.spital.memento.MemorieRezultate;
import ro.spital.memento.OrigineRezultate;
import ro.spital.models.ETipPersonal;
import ro.spital.observer.IObserverPacient;
import ro.spital.observer.PacientSpitalObserver;
import ro.spital.observer.SpitalNotifier;
import ro.spital.prototype.Reteta;
import ro.spital.prototype.RetetaRegistry;
import ro.spital.factoryPattern.FactoryPersonalFactPattern;
import ro.spital.prototypeC4.RetetaMedicament;
import ro.spital.composite.Sectie;
import ro.spital.proxy.IInternare;
import ro.spital.proxy.PacientProxy;
import ro.spital.proxy.Internare;
import ro.spital.state.PacientState;
import ro.spital.state.StareExternat;
import ro.spital.state.StareSubObservatie;
import ro.spital.templateMethod.InternarePacientCritic;
import ro.spital.templateMethod.InternarePacientNormal;
import ro.spital.templateMethod.TemplateInternare;

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
        PersonalSpital brancardier = FactoryPersonal.createPersonal(ro.spital.factory.ETipPersonal.BRANCARDIER, "Ion Popescu");
        PersonalSpital asistent = FactoryPersonal.createPersonal(ro.spital.factory.ETipPersonal.ASISTENT,"Maria Ionescu");
        PersonalSpital medic = FactoryPersonal.createPersonal(ro.spital.factory.ETipPersonal.MEDIC,"Vasile Georgescu");

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();

        System.out.println ();

    // Factory Pattern

        PersonalSpitalPattern asistent1 = FactoryPersonalFactPattern.crearePersonal(ETipPersonal.ASISTENT, "Ion Popescu");
        PersonalSpitalPattern medic1 = FactoryPersonalFactPattern.crearePersonal(ETipPersonal.MEDIC, "Maria Ionescu");

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

        //IPrototype Cerinta 4 (C4)
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
        // Cerinta 7 - Memento

        System.out.println();

        OrigineRezultate origine = new OrigineRezultate();
        MemorieRezultate memorie = new MemorieRezultate();

        origine.setareMetodaLivrare("Online");
        memorie.salvareStare(origine.salvareStare());

        origine.setareMetodaLivrare("Printat");

        origine.restaurareStare(memorie.getStareSalvata());
        System.out.println();

        // Cerinta 8

        System.out.println();

        Departament departamentGeneral = new Departament("Spital General");

        Departament departamentChirurgie = new Departament("Chirurgie");
        departamentChirurgie.adauga(new Sectie("Chirurgie Generala"));
        departamentChirurgie.adauga(new Sectie("Ortopedie"));

        Departament departamentPediatrie = new Departament("Pediatrie");
        departamentPediatrie.adauga(new Sectie("Neonatologie"));
        departamentPediatrie.adauga(new Sectie("Psihiatrie Infantila"));

        // Compun ierarhia
        departamentGeneral.adauga(departamentChirurgie);
        departamentGeneral.adauga(departamentPediatrie);

        // Afisez
        departamentGeneral.afiseazaStructura("");
        System.out.println();

        // Cerinta 9- Proxy

        System.out.println();

        IInternare pacient9 = new PacientProxy("Ion Popescu", true);
        IInternare pacient09 = new PacientProxy("Maria Ionescu", false);

        pacient9.interneaza();
        pacient09.interneaza();

        //Cerinta 10- Flyweitght
        System.out.println();

        PacientFactoryFlyweight factoryFlyweight = new PacientFactoryFlyweight();

        PacientFlyweight pacient10 = factoryFlyweight.getPacient("Ion Popescu", "0711223344", "Str. Libertatii nr. 5");
        PacientFlyweight pacient11 = factoryFlyweight.getPacient("Maria Ionescu", "0725687897", "Str. Frumoasa nr. 8");

        InternareFlyweight internare10 = new InternareFlyweight(pacient10, 101, 3, 5);
        InternareFlyweight internare11 = new InternareFlyweight(pacient11, 102, 1, 7);

        internare10.afiseazaInternare();
        internare11.afiseazaInternare();

        System.out.println("Numar obiecte pacient unice in memorie: " + factoryFlyweight.getNumarPacientiUnici());

        // Cerinta 11 -Strategy

        System.out.println();

        ContextPlata contextPlata = new ContextPlata();

        // Plata cash
        contextPlata.setStrategie(new PlataCash());
        contextPlata.efectueazaPlata("Ion Popescu", 300.0);

        // Plata cu cardul
        contextPlata.setStrategie(new PlataCard());
        contextPlata.efectueazaPlata("Maria Ionescu", 450.0);

        // Cerinta 12 - Observer
        System.out.println();

        SpitalNotifier notifier = new SpitalNotifier();

        IObserverPacient pacient12 = new PacientSpitalObserver("Ion Popescu");
        IObserverPacient pacient13 = new PacientSpitalObserver("Maria Ionescu");
        IObserverPacient pacient14 = new PacientSpitalObserver("George Mihai");

        notifier.aboneaza(pacient12);
        notifier.aboneaza(pacient13);
        notifier.aboneaza(pacient14);

        notifier.trimiteNotificare("ATENTIE: Virus gripal detectat in oras!");
        System.out.println();

        notifier.dezaboneaza(pacient13);
        notifier.trimiteNotificare("ATENTIE: Epidemie de enteroviroza in evolutie!");

        // Cerinta 13 - State
        System.out.println();

        PacientState pacient15 = new PacientState("Ion Popescu");
        pacient15.afiseazaStare();

        PacientState pacient16 = new PacientState("Maria Ionescu");
        pacient16.setStare(new StareSubObservatie());
        pacient16.afiseazaStare();

        PacientState pacient17 = new PacientState("Barbu Popescu");
        pacient17.setStare(new StareExternat());
        pacient17.afiseazaStare();

        // Cerinta 14 - Template Method

        System.out.println();

        TemplateInternare internareNormal = new InternarePacientNormal();
        internareNormal.proceseazaInternare("Ion Popescu");

        System.out.println();

        TemplateInternare internareCritic = new InternarePacientCritic();
        internareCritic.proceseazaInternare("Maria Ionescu");

        System.out.println();

        // Cerinta 15 - Command

        MedicCommand medic15 = new MedicCommand("Dr. Popescu");
        OperatorTriaj operator = new OperatorTriaj();

        operator.adaugaComanda(new ComandaInternare(medic15, "Ion Popescu"));
        operator.adaugaComanda(new ComandaTratament(medic15, "Maria Ionescu"));
        operator.adaugaComanda(new ComandaInternare(medic15, "Barbu Popescu"));

        operator.proceseazaComenzi();


    }
}


