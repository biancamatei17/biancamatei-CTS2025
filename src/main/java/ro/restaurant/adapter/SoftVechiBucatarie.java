package ro.restaurant.adapter;

public class SoftVechiBucatarie implements ISoftBucatarie{
    @Override
    public void printeazaFactura(double total) {
        System.out.println("Factura bucatarie: Total de plata = " + total +" RON");
    }
}
