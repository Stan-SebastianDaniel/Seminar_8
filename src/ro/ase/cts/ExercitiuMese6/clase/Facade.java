package ro.ase.cts.ExercitiuMese6.clase;

public class Facade {
    public static boolean esteMasaPregatita(Masa masa){
        if(OperatoriMese.esteLibera(masa.getNrMesa())){
            Picolo Piccolo1=new Picolo("Piccolo");
            if(Piccolo1.esteDebarasataMasa(masa.getNrMesa())){
                if(Piccolo1.esteAranjata(masa.getNrMesa())){
                    return true;
                }
            }
        }
        return false;
    }

}
