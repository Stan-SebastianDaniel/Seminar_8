package ro.ase.cts.ExercitiuRestaurant8.Clase;

public interface ComponentaAbstracta {
    void prntareElement();
    void adaugaElement(ComponentaAbstracta abstractComponent);
    void stergeElement(ComponentaAbstracta abstractComponent);
    ComponentaAbstracta getElement(int index);
}
