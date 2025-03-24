package ro.spital.main;
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

        // Inițializăm registry-ul
        RetetaRegistry registry = new RetetaRegistry();

        // Creăm o rețetă și o adăugăm în registry
        Reteta reteta1 = new Reteta("Antibiotic", "Substanta X, Substanta Y", 5.0);
        registry.adaugaReteta("Antibiotic", reteta1);

        // Obținem o copie a rețetei fără a apela constructorul
        Reteta retetaCopiata = registry.obtineReteta("Antibiotic");

        // Afișăm rețeta copiată
        if (retetaCopiata != null) {
            retetaCopiata.afiseazaReteta();
        } else {
            System.out.println("Reteta nu a fost gasita.");
        }

        System.out.println ();

        //Prototype Cerinta 4 (C4)
        // Creăm o rețetă inițială
        RetetaMedicament retetaOriginala2 = new RetetaMedicament("Paracetamol");
        retetaOriginala2.adaugaIngredient("Paracetamol", 500.0);
        retetaOriginala2.adaugaIngredient("Zaharina", 10.0);

        System.out.println("Rețeta Originală:");
        retetaOriginala2.afisareReteta();

        // Clonăm rețeta
        RetetaMedicament retetaCopiata2 = (RetetaMedicament) retetaOriginala2.clone();
        System.out.println("\nRețeta Clonată:");
        retetaCopiata2.afisareReteta();

        // Modificăm rețeta clonată și verificăm că nu afectează originalul
        retetaCopiata2.adaugaIngredient("Vitamina C", 50.0);
        System.out.println("\nRețeta Clonată după modificare:");
        retetaCopiata2.afisareReteta();

        System.out.println("\nRețeta Originală rămâne neschimbată:");
        retetaOriginala2.afisareReteta();
    }
}


