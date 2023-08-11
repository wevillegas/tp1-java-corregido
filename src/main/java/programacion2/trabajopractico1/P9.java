
package programacion2.trabajopractico1;


public class P9 {
    private double x1, y1, x2, y2, peri, superficie;

    public P9(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double peri () {
        peri = (x2 - x1) * 2 + (y2 - y1) * 2;
        return peri;
    }
    
    public double superficie (){
        superficie = (x2 - x1) * (y2 - y1);
        return superficie;
    }
}
