package programacion2.trabajopractico1;


public class P5 {
    private float centigrados, fah;

    public P5(float fah) {
        this.fah = fah;
    }
    
    public float grados () {
          centigrados = (fah - 32) * 5 / 9;
          return centigrados;
    }
}
