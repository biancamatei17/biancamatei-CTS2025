package ro.restaurant.main;

import ro.restaurant.adapter.AdapterSoftBar;
import ro.restaurant.adapter.ISoftBucatarie;
import ro.restaurant.adapter.SoftNouBar;
import ro.restaurant.adapter.SoftVechiBucatarie;
import ro.restaurant.builder.Rezervare;
import ro.restaurant.builder.RezervareBuilder;
import ro.restaurant.composite.CategorieMeniu;
import ro.restaurant.composite.IComponentaMeniu;
import ro.restaurant.composite.ProdusMeniu;
import ro.restaurant.decorator.DecoratorLaMultiAni;
import ro.restaurant.decorator.INotaDePlata;
import ro.restaurant.decorator.NotaDePlata;
import ro.restaurant.decorator1.IRezervarePersoane;
import ro.restaurant.decorator1.RezervareCuLimitare;
import ro.restaurant.decorator1.RezervarePersoaneStandard;
import ro.restaurant.facade.ModulReceptionist;
import ro.restaurant.factory.ETipSupa;
import ro.restaurant.factory.ISupa;
import ro.restaurant.factory.SupaFactory;
import ro.restaurant.factoryMethod.FactoryDesert;
import ro.restaurant.factoryMethod.FactoryFelDeMancare;
import ro.restaurant.factoryMethod.FactorySupa;
import ro.restaurant.factoryMethod.IFelMancare;
import ro.restaurant.flyweight.ClientFact;
import ro.restaurant.flyweight.ClientFly;
import ro.restaurant.flyweight.RezervareFly;
import ro.restaurant.prototype.Client;


public class Main {
    public static void main(String[] args) {

        //Cerinta 1

        ISupa supa1 = SupaFactory.creazaSupa(ETipSupa.SUPA_DE_LEGUME);
        supa1.serveste();
        System.out.println();

        ISupa supa2 = SupaFactory.creazaSupa(ETipSupa.SUPA_DE_CIUPERCI);
        supa2.serveste();
        System.out.println();

        ISupa supa3 = SupaFactory.creazaSupa(ETipSupa.SUPA_DE_VITA);
        supa3.serveste();
        System.out.println();

        // Cerinta 2
        Rezervare rezervare1 = new RezervareBuilder()
                .setAsezareLaGeam(true)
                .setMuzicaAmbientala(true)
                .setGenMuzica("Jazz")
                .build();

        Rezervare rezervare2 = new RezervareBuilder()
                .setScauneErgonomice(true)
                .setDecorareMasa(true)
                .build();

        rezervare1.afiseazaDetalii();
        System.out.println();
        rezervare2.afiseazaDetalii();

        System.out.println();

        // Cerinta 3

        FactoryFelDeMancare factorySupa = new FactorySupa();
        FactoryFelDeMancare factoryDesert = new FactoryDesert();

        IFelMancare supa4 = factorySupa.createFelMancare("legume");
        supa4.servire();

        IFelMancare supa5 = factorySupa.createFelMancare("vita");
        supa5.servire();

        IFelMancare desert1 = factoryDesert.createFelMancare("papanasi");
        desert1.servire();

        IFelMancare desert2 = factoryDesert.createFelMancare("cheesecake");
        desert2.servire();

        System.out.println();

        // Cerinta 4

        Client clientOriginal = new Client("Ana Popescu", "ana@email.com", "071234567");
        Client clientClona1 = clientOriginal.clone();
        Client clientClona2 = clientOriginal.clone();

        clientClona1.afiseazaDetalii();
        clientClona2.afiseazaDetalii();
        System.out.println();

        // Cerinta 5

        ISoftBucatarie softBucatarie = new SoftVechiBucatarie();
        softBucatarie.printeazaFactura(87.5);

        System.out.println();

        SoftNouBar softNou = new SoftNouBar();
        ISoftBucatarie adapterBar = new AdapterSoftBar(softNou, "Zona Bar");
        adapterBar.printeazaFactura(45.0);

        System.out.println();

        // Cerinta 6

        ModulReceptionist modul = new ModulReceptionist();

        int masa1 = 6;
        System.out.println("\nVerificare pentru masa " + masa1);
        if (modul.poateFiOcupataMasa(masa1)) {
            System.out.println("Masa " + masa1 + " poate fi ocupata.");
        } else {
            System.out.println("Masa " + masa1 + " NU poate fi ocupata.");
        }

        int masa2 = 15;
        System.out.println("\nVerificare pentru masa " + masa2);
        if (modul.poateFiOcupataMasa(masa2)) {
            System.out.println("Masa " + masa2 + " poate fi ocupata.");
        } else {
            System.out.println("Masa " + masa2 + " NU poate fi ocupata.");
        }

        System.out.println();

        // Cerinta 7
        INotaDePlata notaSimpla = new NotaDePlata(123.5);
        System.out.println("Nota fara decorare");
        notaSimpla.printeazaNota();

        System.out.println("\nNota cu felicitare");
        INotaDePlata notaDecorata = new DecoratorLaMultiAni(notaSimpla);
        notaDecorata.printeazaNota();

        System.out.println();

        // Cerinta 8

        CategorieMeniu meniuPrincipal = new CategorieMeniu("Meniu");
        CategorieMeniu bauturi = new CategorieMeniu("Bauturi");
        CategorieMeniu sucuri = new CategorieMeniu("Sucuri");
        CategorieMeniu cafea = new CategorieMeniu("Cafea");


        IComponentaMeniu apaPlata = new ProdusMeniu("Apa plata");
        IComponentaMeniu apaMinerala = new ProdusMeniu("Apa minerala");
        IComponentaMeniu cola = new ProdusMeniu("Coca Cola");
        IComponentaMeniu espresso = new ProdusMeniu("Espresso");


        sucuri.adaugaComponenta(cola);
        sucuri.adaugaComponenta(apaPlata);
        sucuri.adaugaComponenta(apaMinerala);

        cafea.adaugaComponenta(espresso);

        bauturi.adaugaComponenta(sucuri);
        bauturi.adaugaComponenta(cafea);

        meniuPrincipal.adaugaComponenta(bauturi);
        meniuPrincipal.afiseaza("");

        System.out.println();
        // Cerinta 9

        IRezervarePersoane rezervareStandard = new RezervarePersoaneStandard();
        IRezervarePersoane rezervareControlata = new RezervareCuLimitare(rezervareStandard);

        System.out.println("Test 1: 2 persoane");
        rezervareControlata.realizeazaRezervare(2);

        System.out.println("\nTest 2: 4 persoane");
        rezervareControlata.realizeazaRezervare(4);

        System.out.println("\nTest 3: 6 persoane");
        rezervareControlata.realizeazaRezervare(6);

        System.out.println();

        // Cerinta 10

        ClientFact factory = new ClientFact();

        ClientFly client1 = factory.getClientFly("Ion Popescu", "0711222333", "ion@email.com");
        ClientFly client2 = factory.getClientFly("Ion Popescu", "0711222333", "ion@email.com"); // va fi acelasi

        RezervareFly r1 = new RezervareFly(5, 2, "18:00");
        RezervareFly r2 = new RezervareFly(8, 4, "19:30");
        RezervareFly r3 = new RezervareFly(3, 6, "20:00");

        r1.afiseaza(client1);
        r2.afiseaza(client2);
        r3.afiseaza(client1);
    }
}


