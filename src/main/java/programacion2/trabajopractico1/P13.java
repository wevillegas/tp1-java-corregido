package programacion2.trabajopractico1;


public class P13 {
    private int a, b, c;

    public P13(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void ordenarAsDes () {
        if (a > b) {
            if (b > c) {
                if (b == a - 1) {
                    if (c == b - 1) {
                        System.out.println("Decreciente y consecutivo");
                    } else {
                        System.out.println("Decreciente");
                    }

                } else {
                    System.out.println("Decreciente");
                }

            } else {
                System.out.println("Ni ascendente ni decreciente");
            }

        } else if (c > b) {
            if (c == b + 1) {
                if (b == a + 1) {
                    System.out.println("Ascendente y consecutivo");
                } else {
                    System.out.println("Ascendente");
                }

            } else {
                System.out.println("Ascendente");
            }

        } else {
            System.out.println("Ni ascendente ni decreciente");
        }
    }
}
