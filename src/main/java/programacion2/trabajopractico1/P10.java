
package programacion2.trabajopractico1;


public class P10 {
    private int a, b, c, d, e, f, mx, my, m, y, x;

    public P10(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public int x (){
        m = a * e - b * d;
        mx = c * e - b * f;
        my = a * f - c * d;
        x = mx / m;
        return x;
    }
    
    public int y (){
        m = a * e - b * d;
        mx = c * e - b * f;
        my = a * f - c * d;
        y = my / m;
        return y;
    }
}
