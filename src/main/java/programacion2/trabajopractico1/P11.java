package programacion2.trabajopractico1;


public class P11 {
    private int aa, bb, cc, h, a2, b2, c2, a2b2, b2c2, a2c2;

    public P11(int aa, int bb, int cc) {
        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
    }
    
    public void triangulo (){
        if (aa > 0 && bb > 0 && cc > 0) {
            a2 = (int) Math.pow(aa, 2);
            b2 = (int) Math.pow(bb, 2);
            c2 = (int) Math.pow(cc, 2);
            a2b2 = a2 + b2;
            b2c2 = b2 + c2;
            a2c2 = a2 + c2;
            // bloques if y else
            h = (int) Math.sqrt(a2b2);
            if (h == cc) {
                System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
            } else {
                h = (int) Math.sqrt(b2c2);
                if (h == aa) {
                    System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
                } else {
                    h = (int) Math.sqrt(a2c2);
                    if (h == bb) {
                        System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
                    } else {
                        System.out.println("Los valores ingresados NO son lados de un triangulo rectangulo");
                    }
                }

            }
        } else {
            System.out.println("Alguno de los numeros no es positivo, vuelva a ingresarlos");
        }
    }
}
