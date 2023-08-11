
package programacion2.trabajopractico1;

public class P4 {
    private double metro, deci, centi;

    public P4(double metro) {
        this.metro = metro;
    }
    
    public double metroADeci (){
        deci = metro * 10;
        return deci;
    }
    
    public double metroACenti (){
        centi = metro * 100;
        return centi;
    }
}
