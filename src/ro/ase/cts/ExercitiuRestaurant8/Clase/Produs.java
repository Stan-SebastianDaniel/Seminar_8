package ro.ase.cts.ExercitiuRestaurant8.Clase;

public class Produs implements ComponentaAbstracta{
    private String numeProdus;

    public Produs(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    @Override
    public void prntareElement() {
        System.out.println(this.numeProdus);
    }

    @Override
    public void adaugaElement(ComponentaAbstracta abstractComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeElement(ComponentaAbstracta abstractComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getElement(int index) {
        throw new UnsupportedOperationException();
    }
}
