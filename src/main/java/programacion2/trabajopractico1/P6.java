package programacion2.trabajopractico1;


public class P6 {
    private float base, altura, perimetro, area;

    public P6(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public float perimetro (){
        perimetro = 2 * (base + altura);
        return perimetro;         
    }
    
    public float area (){
        area = base * altura;
        return area;
    }
}
