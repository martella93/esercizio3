package esercizio2;

public class UsaSIM {
    public static void main(String[] args) {
        SIM Sim= new SIM("3206578945");
        Sim.stampaDati();
        Sim.caricaCredito(10);
        Sim.stampaDati();

        Chiamata[] listaChiamata = new Chiamata[5];
        listaChiamata[0] = new Chiamata(10,"3206577478");
        listaChiamata[1] = new Chiamata(1,"3206479478");
        listaChiamata[2] = new Chiamata(5,"3206120178");
        listaChiamata[3] = new Chiamata(7,"3116577478");
        listaChiamata[4] = new Chiamata(14,"3147577478");
        Sim.setListaChiamate(listaChiamata);
        Sim.stampaDati();


    }
}
