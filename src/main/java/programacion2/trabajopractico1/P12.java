package programacion2.trabajopractico1;


public class P12 {
    private int diaNac, mesNac, anioNac, diaAct, mesAct, anioAct, edad;

    public P12(int diaNac, int mesNac, int anioNac, int diaAct, int mesAct, int anioAct) {
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.anioNac = anioNac;
        this.diaAct = diaAct;
        this.mesAct = mesAct;
        this.anioAct = anioAct;
    }
    
    public int edad (){
        if (mesNac < mesAct) {
            edad = anioAct - anioNac;
        } else if (mesAct == mesNac) {
            if (diaNac <= diaAct) {
                edad = anioAct - anioNac;
            } else {
                edad = (anioAct - anioNac) - 1;
            }

        } else if (mesNac > mesAct) {
            edad = (anioAct - anioNac) - 1;
        }
        return edad;
    }
}
