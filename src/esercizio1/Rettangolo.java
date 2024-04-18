package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(int altezza, int larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;
    }
    public double getAltezza(){
        return altezza;
    }
    public double getLarghezza(){
        return larghezza;
    }
    public double perimetro(){
        return (altezza+larghezza)*2;
    }
    public double area(){
        return altezza*larghezza;
    }

}
