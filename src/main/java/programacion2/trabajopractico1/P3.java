package programacion2.trabajopractico1;

public class P3 {
    private double n31, n32, suma3, raiz;

    public P3(double n31, double n32) {
        this.n31 = n31;
        this.n32 = n32;
    }
    
    public double mediaGeo (){
        suma3 = n31 + n32;
        raiz = Math.sqrt(suma3);
        return raiz;
    }
    
}
