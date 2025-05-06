package ro.restaurant.main;

import ro.restaurant.builder.Rezervare;
import ro.restaurant.builder.RezervareBuilder;
import ro.restaurant.factory.ETipSupa;
import ro.restaurant.factory.ISupa;
import ro.restaurant.factory.SupaFactory;

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
    }
}
