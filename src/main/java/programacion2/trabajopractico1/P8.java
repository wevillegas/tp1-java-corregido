
package programacion2.trabajopractico1;


public class P8 {
    private double precio, iva, IB, IM;

    public P8(double precio) {
        this.precio = precio;
    }
    
    public double iva () {
        iva = precio * 0.21;
        return iva;
    }
    
    public double IB () {
        IB = precio * 0.025;
        return IB;
    }
    
    public double IM () {
        IM = precio * 0.015;
        return IM;
    }
}
