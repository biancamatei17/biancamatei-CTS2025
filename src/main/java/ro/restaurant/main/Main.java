package ro.restaurant.main;

import ro.restaurant.builder.Rezervare;
import ro.restaurant.builder.RezervareBuilder;
import ro.restaurant.factory.ETipSupa;
import ro.restaurant.factory.ISupa;
import ro.restaurant.factory.SupaFactory;
import ro.restaurant.factoryMethod.FactoryDesert;
import ro.restaurant.factoryMethod.FactoryFelDeMancare;
import ro.restaurant.factoryMethod.FactorySupa;
import ro.restaurant.factoryMethod.IFelMancare;
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


    }
}
