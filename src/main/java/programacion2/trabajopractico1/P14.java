package programacion2.trabajopractico1;

public class P14 {

    private int a, b, c;

    public P14(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void ordenar() {
        if (a == b || b == c || a == c) {
            System.out.println("Los numeros son iguales");
        } else if (a < b) {
            if (b < c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (a < c) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }

        } else if (a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b < c) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
