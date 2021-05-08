package ro.ase.cts.ExercitiuRestaurant8.Clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaAbstracta{
    private String numeSectiune;
    private List<ComponentaAbstracta> listaComponente = new ArrayList<>();

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void prntareElement() {
        System.out.println("Sectiunea " + this.numeSectiune);
        for (ComponentaAbstracta a:listaComponente) {
            a.prntareElement();
        }
    }

    @Override
    public void adaugaElement(ComponentaAbstracta abstractComponent) {
        if (abstractComponent != null){
            listaComponente.add(abstractComponent);
        }
    }

    @Override
    public void stergeElement(ComponentaAbstracta abstractComponent) {
        if (abstractComponent != null){
            listaComponente.remove(abstractComponent);
        }
    }

    @Override
    public ComponentaAbstracta getElement(int index) {
        if(index >= 0 && index < listaComponente.size()){
            return listaComponente.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
}
