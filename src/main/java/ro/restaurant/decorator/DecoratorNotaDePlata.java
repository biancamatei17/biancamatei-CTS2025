package ro.restaurant.decorator;

public abstract class DecoratorNotaDePlata implements INotaDePlata {
    protected INotaDePlata nota;

    public DecoratorNotaDePlata(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
        printeazaFelicitare();
    }

    protected abstract void printeazaFelicitare();
}