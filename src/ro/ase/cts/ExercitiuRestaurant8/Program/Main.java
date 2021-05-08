package ro.ase.cts.ExercitiuRestaurant8.Program;

import ro.ase.cts.ExercitiuRestaurant8.Clase.Produs;
import ro.ase.cts.ExercitiuRestaurant8.Clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        Sectiune bauturi = new Sectiune("bauturi");
        Sectiune deserturi = new Sectiune("deserturi");

        Produs cola = new Produs("Cola");
        Produs tiramisu = new Produs("Tiramisu");
        Produs frappe = new Produs("Frappe");

        bauturi.adaugaElement(cola);
        bauturi.adaugaElement(frappe);
        deserturi.adaugaElement(tiramisu);

        Sectiune meniu = new Sectiune("Meniu");

        meniu.adaugaElement(bauturi);
        meniu.adaugaElement(deserturi);

        meniu.prntareElement();
        System.out.println("=================================================================");

        deserturi.adaugaElement(frappe);
        bauturi.stergeElement(frappe);
        meniu.prntareElement();
    }
}
