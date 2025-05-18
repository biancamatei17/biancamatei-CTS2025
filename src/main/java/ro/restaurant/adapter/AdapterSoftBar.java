package ro.restaurant.adapter;

public class AdapterSoftBar implements ISoftBucatarie {
    private SoftNouBar softNouBar;
    private String locatieBar;

    public AdapterSoftBar(SoftNouBar softNouBar, String locatieBar) {
        this.softNouBar = softNouBar;
        this.locatieBar = locatieBar;
    }

    @Override
    public void printeazaFactura(double total) {
        softNouBar.generareFactura(total, locatieBar);
    }
}