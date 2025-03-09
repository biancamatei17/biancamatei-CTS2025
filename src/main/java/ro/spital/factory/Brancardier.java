package ro.spital.factory;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier: " + nume);
    }
}
