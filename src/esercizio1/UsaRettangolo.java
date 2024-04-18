package esercizio1;

public class UsaRettangolo {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(10, 15);
        stampaRettangolo(rettangolo);
        Rettangolo rettangolo1 = new Rettangolo(14,20);
        stampaRettangolo(rettangolo1);
        stampaDueRettangoli(rettangolo, rettangolo1);

    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("L'altezza del rettangolo è: " + rettangolo.getAltezza());
        System.out.println("La larghezza del rettangolo è: " + rettangolo.getLarghezza());
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());
        System.out.println(("L'area del rettangolo è: " + rettangolo.area()));
    }
    public static void stampaDueRettangoli(Rettangolo rettangolo, Rettangolo rettangolo1){
        System.out.println("Rettangolo 1");
        System.out.println("Il perimetro del rettangolo è: " + rettangolo.perimetro());
        System.out.println("L'area del rettangolo è: " + rettangolo.area());

        System.out.println("Rettangolo 2");
        System.out.println("Il perimetro del rettangolo è: " + rettangolo1.perimetro());
        System.out.println("L'area del rettangolo è: " + rettangolo1.area());

        double sommaPerimetri = rettangolo.perimetro()+rettangolo1.perimetro();
        System.out.println("Somma perimetri: "+sommaPerimetri);
        double sommaAree = rettangolo.area() + rettangolo1.area();
        System.out.println("Somma aree: "+sommaAree);


    }

}
