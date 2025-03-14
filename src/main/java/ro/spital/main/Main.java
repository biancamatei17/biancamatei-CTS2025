package ro.spital.main;
import ro.spital.builder.Pacient;
import ro.spital.builder.PacientBuilder;
import ro.spital.factory.FactoryPersonal;
import ro.spital.factory.PersonalSpital;
import ro.spital.factory.TipPersonal;
import ro.spital.factoryPattern.*;
import ro.spital.prototype.Reteta;
import ro.spital.prototype.RetetaRegistry;

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
        PersonalSpital brancardier = FactoryPersonal.createPersonal(TipPersonal.BRANCARDIER, "Ion Popescu");
        PersonalSpital asistent = FactoryPersonal.createPersonal(TipPersonal.ASISTENT,"Maria Ionescu");
        PersonalSpital medic = FactoryPersonal.createPersonal(TipPersonal.MEDIC,"Vasile Georgescu");

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();

        System.out.println ();

    // Factory Pattern

        FactoryPersonalInterface factoryBrancardier = new FactoryBrancardier();
        FactoryPersonalInterface factoryAsistent = new FactoryAsistent();
        FactoryPersonalInterface factoryMedic = new FactoryMedic();
        FactoryPersonalInterface factoryFarmacist = new FactoryFarmacist();

        PersonalSpitalPattern brancardier2= factoryBrancardier.crearePersonal("Ion Popescu");
        PersonalSpitalPattern asistent2= factoryAsistent.crearePersonal("Maria Ionescu");
        PersonalSpitalPattern medic2= factoryMedic.crearePersonal("Andrei Georgescu");
        PersonalSpitalPattern farmacist = factoryFarmacist.crearePersonal("Angelica Ionica");

        brancardier2.descriere();
        asistent2.descriere();
        medic2.descriere();
        farmacist.descriere();

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

    }
}

