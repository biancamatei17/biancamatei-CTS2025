package ro.restaurant.decorator;

public class DecoratorLaMultiAni extends DecoratorNotaDePlata {
    public DecoratorLaMultiAni(INotaDePlata nota) {
        super(nota);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("La multi ani din partea restaurantului!");
    }
}
