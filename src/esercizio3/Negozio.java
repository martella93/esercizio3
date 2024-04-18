package esercizio3;

public class Negozio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("166369","Luca","luca93martella@gmail.com", 2024);
        Articolo mouse = new Articolo("4466","ciao ciao", 30.95, 0);
        mouse.aggiungiPezziMagazzino(10);
        Articolo matita = new Articolo("5256","bella",22.1,0);
        matita.aggiungiPezziMagazzino(5);
        System.out.println("DATI CLIENTE");
        cliente.stampaDati();
        System.out.println("DATI ARTICOLO");
        mouse.stampaDati();
        matita.stampaDati();
         Articolo[] articoli = new Articolo[2];
         articoli[0]=mouse;
         articoli[1]=matita;
         Carrello carrello = new Carrello(cliente);
         carrello.setElencoArticoli(articoli);

        System.out.println(carrello.getCostoTotArticoli());
    }
}
