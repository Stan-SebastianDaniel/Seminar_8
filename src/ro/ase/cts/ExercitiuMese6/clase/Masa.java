package ro.ase.cts.ExercitiuMese6.clase;

public class Masa {
    private int nrMesa;
    private int nrLocuri;

    public int getNrMesa() {
        return nrMesa;
    }

    public void setNrMesa(int nrMesa) {
        this.nrMesa = nrMesa;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public Masa(int nrMesa, int nrLocuri) {
        this.nrMesa = nrMesa;
        this.nrLocuri = nrLocuri;
    }
}
