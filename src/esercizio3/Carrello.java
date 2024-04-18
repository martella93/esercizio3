package esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;
    private double costoTotArticoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public double getCostoTotArticoli() {
        costoTotArticoli = calcolaCostoTot();
        return costoTotArticoli;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }
    private double calcolaCostoTot(){
        double somma=0;
        for (int i=0; i< elencoArticoli.length; i++){
            double prezzo = elencoArticoli[i].getPrezzo();
            somma = somma +prezzo;
        }
        return somma;
    }


}
