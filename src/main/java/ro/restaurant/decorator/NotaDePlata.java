package ro.restaurant.decorator;

public class NotaDePlata implements INotaDePlata {
    private double suma;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Total de plata: " + suma + " RON");
    }
}