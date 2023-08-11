package programacion2.trabajopractico1;


public class P7 {
    private double radio, diametro, pem, sup;

    public P7(double radio) {
        this.radio = radio;
    }
    
    public double diametro (){
        diametro = 2 * radio;
        return diametro;
    }
    
    public double pem (){
        pem = 2 * Math.PI * radio;
        return pem;
    }
    
    public double sup (){
        sup = Math.PI * Math.pow(radio, 2);
        return sup;
    }
}
