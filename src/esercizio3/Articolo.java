package esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }
    public void aggiungiPezziMagazzino(int numeroPezziMagazzino){
        this.pezziDisponibili = this.pezziDisponibili+numeroPezziMagazzino;
    }
    public void stampaDati(){
        System.out.println("codice " + this.codiceArticolo);
        System.out.println("pezzi disponibili " + this.pezziDisponibili);
        System.out.println("prezzo " + this.prezzo);
        System.out.println("descrizione " + this.descrizioneArticolo);
    }

}

