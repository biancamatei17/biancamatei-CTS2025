package ro.spital.main;
import ro.spital.builder.Pacient;
import ro.spital.builder.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Ion Popescu")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();

        Pacient pacient2 = new PacientBuilder("Maria Ionescu").build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}