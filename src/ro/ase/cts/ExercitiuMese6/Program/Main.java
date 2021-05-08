package ro.ase.cts.ExercitiuMese6.Program;

import ro.ase.cts.ExercitiuMese6.clase.Facade;
import ro.ase.cts.ExercitiuMese6.clase.Masa;
import ro.ase.cts.ExercitiuMese6.clase.OperatoriMese;
import ro.ase.cts.ExercitiuMese6.clase.Picolo;

public class Main {
    public static void main(String[] args) {
        Masa masa= new Masa(1,10);
       if(OperatoriMese.esteLibera(1)){
           Picolo Piccolo1=new Picolo("Piccolo");
           if(Piccolo1.esteDebarasataMasa(masa.getNrMesa())){
               if(Piccolo1.esteAranjata(masa.getNrMesa())){
                   System.out.println("Potiti la masa domnule client!");
               }
               else {
                   System.out.println("Va rog sa mai asteptati nitel");
               }
           }
           else {
               System.out.println("Va rog sa mai asteptati nitel");
           }
       }
       else {
           System.out.println("Va rog sa mai asteptati nitel");
       }

        if(Facade.esteMasaPregatita(new Masa(30,9))){
            System.out.println("Poftiti la masa");
        }
        else {
            System.out.println("Mai asteptati putin");
        }

    }
}
