package esercizio2;

public class SIM {
    private String numTelefono;
    private double credito;
    private Chiamata[] listaChiamate;

    public SIM(String numTelefono){
        this.numTelefono=numTelefono;
        this.credito=0;
        this.listaChiamate= new Chiamata[5];
    }

    public String getNumTelefono(){
        return numTelefono;
    }

   public void setListaChiamate(Chiamata[] listaChiamate){
        this.listaChiamate=listaChiamate;
   }

    public void stampaDati(){
        System.out.println("num: " + this.numTelefono);
        System.out.println("credito: " + this.credito);

        if (listaChiamate[0] != null){
            System.out.println("Chiamata 1: " + listaChiamate[0].getNumeroChiamato()+ " Durata in minuti: " + listaChiamate[0].getDurata());
        }
        if (listaChiamate[1] != null){
            System.out.println("Chiamata 1: " + listaChiamate[1].getNumeroChiamato()+ " Durata in minuti: " + listaChiamate[1].getDurata());
        }
        if (listaChiamate[2] != null){
            System.out.println("Chiamata 1: " + listaChiamate[2].getNumeroChiamato()+ " Durata in minuti: " + listaChiamate[2].getDurata());
        }
        if (listaChiamate[3] != null){
            System.out.println("Chiamata 1: " + listaChiamate[3].getNumeroChiamato()+ " Durata in minuti: " + listaChiamate[3].getDurata());
        }
        if (listaChiamate[4] != null){
            System.out.println("Chiamata 1: " + listaChiamate[4].getNumeroChiamato()+ " Durata in minuti: " + listaChiamate[4].getDurata());
        }
    }
    public void caricaCredito(double nuovoCredito){
        this.credito= this.credito+nuovoCredito;
    }

}
