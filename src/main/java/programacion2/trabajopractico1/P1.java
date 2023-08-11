
package programacion2.trabajopractico1;

// Ingresar tres números enteros, presentar por pantalla la suma de ellos.
public class P1 {
    // atributos
    private int n1, n2, n3, suma;

    // metodos
    public P1(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public int Suma () {
        suma = n1 + n2 + n3;
        return suma;
    }
    
}
