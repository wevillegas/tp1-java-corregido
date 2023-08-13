package programacion2.trabajopractico1;
import java.util.Scanner;

public class TrabajoPractico1 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero (del 1 al 14) del ejercicio que desea ejecutar");
        System.out.println("------------------------------------------------------------------");
        
         int ejercicio;
         Scanner teclado = new Scanner(System.in);
         ejercicio = teclado.nextInt();
         
         switch (ejercicio){
             case 1:               
                 int n1, n2, n3, suma;
                 System.out.println("Ingresar tres números enteros, presentar por pantalla la suma de ellos.");
                 System.out.println("Ingrese el primer numero");
                 n1 = teclado.nextInt();
                 System.out.println("Ingrese el segundo numero");
                 n2 = teclado.nextInt();
                 System.out.println("Ingrese el tercer numero");
                 n3 = teclado.nextInt();            
                 P1 ejercicio1 = new P1(n1, n2, n3);
                 suma = ejercicio1.Suma();
                 System.out.println("La suma de los numeros es igual a " + suma);
                 break;
             case 2:
                 float n21, n22, prom;
                 System.out.println("Leer dos números enteros presentar por pantalla el promedio de ellos.");
                 System.out.println("ingrese el primer numero");
                 n21 = teclado.nextFloat();
                 System.out.println("ingrese el segundo numero");
                 n22= teclado.nextFloat();      
                 P2 ejercicio2 = new P2 (n21, n22);
                 prom = ejercicio2.promedio();
                 System.out.println("El promedio es de "+ prom);
                 break;
             case 3: 
                 double n31, n32, raiz;
                 System.out.println("Ingresar dos números enteros y presentar por pantalla la media geométrica.");
                 System.out.println("ingrese el primer numero");
                 n31 = teclado.nextDouble();
                 System.out.println("ingrese el segundo numero");
                 n32= teclado.nextDouble();            
                 P3 ejercicio3 = new P3 (n31, n32);
                 raiz = ejercicio3.mediaGeo();
                 System.out.println("La media geometrica es: " + raiz);
                 break;
             case 4:
                 double metro, centi, deci;
                 System.out.println("Convertir una medida dada en metros a sus equivalentes en decímetros y centímetros");
                 System.out.println("Ingrese el valor en metros");
                 metro = teclado.nextDouble();               
                 P4 ejercicio4 = new P4(metro);
                 deci = ejercicio4.metroADeci();
                 centi = ejercicio4.metroACenti();
                 System.out.println("El valor en metros dado es de: " + metro + ", en decimetros es: " + deci + " y en centimetros es: " + centi);
             case 5:
                 float centigrados, fah;
                 System.out.println("Convertir temperatura en grados Fahrenheit a grados centígrados ");
                 System.out.println("Ingrese una temperatura en grados Fahrenheit");
                 fah = teclado.nextFloat();                
                 P5 ejercicio5 = new P5(fah);
                 centigrados = ejercicio5.grados();
                 System.out.println("La temperatura en grados centigrados es: " + centigrados);
                 break;
             case 6:
                 float base, altura, perimetro, area;
                 System.out.println("Ingresar los lados de un rectángulo, presentar por pantalla su perímetro y su superficie.");
                 System.out.println("Ingrese el valor de la BASE del rectangulo");
                 base = teclado.nextFloat();
                 System.out.println("Ingrese el valor de la ALTURA del rectangulo");
                 altura = teclado.nextFloat();                
                 P6 ejercicio6 = new P6 (base, altura);
                 perimetro = ejercicio6.perimetro();
                 area = ejercicio6.area();
                 System.out.println("El PERIMETRO del rectangulo es igual a " + perimetro);
                 System.out.println("El AREA del rectangulo es igual a " + area);
                 break;
             case 7:
                 double radio, diametro, pem, sup;
                 System.out.println("Ingresar el radio de un círculo, presentar por pantalla el diámetro, el perímetro y el área");
                 System.out.println("Ingrese el radio del circulo");
                 radio = teclado.nextDouble();
                 P7 ejercicio7 = new P7(radio);
                 diametro = ejercicio7.diametro();
                 pem = ejercicio7.pem();
                 sup = ejercicio7.sup();
                 System.out.println("El DIAMETRO del circulo es " + diametro);
                 System.out.println("El PERIMETRO del circulo es " + pem);
                 System.out.println("El AREA del circulo es " + sup);
                 break;
             case 8:
                 double precio, iva, IB, IM;
                 System.out.println("Dado el precio de un producto indicar los impuestos que debe pagar. IVA, Ingresos Brutos e Impuesto Municipal");
                 System.out.println("Ingrese un precio");
                 precio = teclado.nextDouble();
                 P8 ejercicio8 = new P8(precio);
                 iva = ejercicio8.iva();
                 IB = ejercicio8.IB();
                 IM = ejercicio8.IM();
                 System.out.println("IVA = $" + iva);
                 System.out.println("Ingresos Brutos = $" + IB);
                 System.out.println("Impuesto Municipal = $" + IM);
                 break;
             case 9:
                 double x1, y1, x2, y2, peri, superficie;
                 System.out.println("Ingresar dos puntos en el plano P1(x1, y1) y P2(x2, y2), \n" +
                 "estos corresponden, respectivamente, a los vértices inferior izquierdo y superior derecho de un rectángulo.\n" +
                 "Indicar el perímetro y la superficie del rectángulo.");
                 System.out.println("Ingrese un valor para X1");
                 x1 = teclado.nextDouble();
                 System.out.println("Ingrese un valor para Y1");
                 y1 = teclado.nextDouble();
                 System.out.println("Ingrese un valor para X2");
                 x2 = teclado.nextDouble();
                 System.out.println("Ingrese un valor para Y2");
                 y2 = teclado.nextDouble();
                 P9 ejercicio9 = new P9(x1, y1, x2, y2);
                 peri = ejercicio9.peri();
                 superficie = ejercicio9.superficie();
                 System.out.println("El perimetro es igual a " + peri);
                 System.out.println("La superficie es igual a " + superficie);
                 break;
             case 10:
                 int a, b, c, d, e, f, y, x;
                 System.out.println("Resolver un sistema de dos ecuaciones lineales con dos incógnitas");
                 System.out.println("ingrese un numero A:");
                 a = teclado.nextInt();
                 System.out.println("ingrese un numero B:");
                 b = teclado.nextInt();
                 System.out.println("ingrese un numero C:");
                 c = teclado.nextInt();
                 System.out.println("ingrese un numero D:");
                 d = teclado.nextInt();
                 System.out.println("ingrese un numero E:");
                 e = teclado.nextInt();
                 System.out.println("ingrese un numero F:");
                 f = teclado.nextInt();
                 P10 ejercicio10 = new P10(a, b, c, d, e, f);
                 x = ejercicio10.x();
                 y = ejercicio10.y();
                 System.out.println("X = " + x);
                 System.out.println("Y = " + y);
                 break;
             case 11:
                 int aa, bb, cc;
                 System.out.println("Ingresar tres valores positivos, indicar si son lados de un triángulo rectángulo. Presentar por pantalla el mensaje correspondiente");
                 System.out.println("Ingrese un valor positivo A");
                 aa = teclado.nextInt();
                 System.out.println("Ingrese un valor positivo B");
                 bb = teclado.nextInt();
                 System.out.println("Ingrese un valor positivo C");
                 cc = teclado.nextInt();
                 P11 ejercicio11 = new P11(aa, bb, cc);
                 ejercicio11.triangulo();
                 break;
             case 12:
                 int diaNac, mesNac, anioNac, diaAct, mesAct, anioAct, edad;
                 System.out.println("Ingresar la fecha de nacimiento de una persona con en el formato dd, mm y aaaa. Mostrar por pantalla la edad (años, meses y días)");
                 System.out.println("Ingrese el dia actual");
                 diaAct = teclado.nextInt();
                 System.out.println("Ingrese el mes actual");
                 mesAct = teclado.nextInt();
                 System.out.println("Ingrese el año actual");
                 anioAct = teclado.nextInt();
                 System.out.println("Ingrese el dia de nacimiento");
                 diaNac = teclado.nextInt();
                 System.out.println("Ingrese el mes de nacimiento");
                 mesNac = teclado.nextInt();
                 System.out.println("Ingrese el año de nacimiento");
                 anioNac = teclado.nextInt();
                 P12 ejercicio12 = new P12(diaNac, mesNac, anioNac, diaAct, mesAct, anioAct);
                 edad = ejercicio12.edad();
                 System.out.println("La edad es " + edad + " años");
             case 13:
                 int a13, b13, c13;
                 System.out.println("Ingresar tres números enteros, \n" +
                 "determinar si están ordenados en forma ascendente o descendente, \n" +
                 "y si son consecutivos");
                 System.out.println("Ingrese el primer valor");
                 a13 = teclado.nextInt();
                 System.out.println("Ingrese el segundo valor");
                 b13 = teclado.nextInt();
                 System.out.println("Ingrese el tercer valor");
                 c13 = teclado.nextInt();
                 P13 ejercicio13 = new P13(a13, b13, c13);
                 ejercicio13.ordenarAsDes();
                 break;
             case 14:
                 int a14, b14, c14;
                 System.out.println("Ingresar tres números, ordenarlos en forma ascendente y presentarlos por pantalla. ");
                 System.out.println("Ingrese el primer valor");
                 a14 = teclado.nextInt();
                 System.out.println("Ingrese el segundo valor");
                 b14 = teclado.nextInt();
                 System.out.println("Ingrese el tercer valor");
                 c14 = teclado.nextInt();
                 P14 ejercicio14 = new P14(a14, b14, c14);
                 ejercicio14.ordenar();
                 break;
             default:
                System.out.println("Numero incorrecto");
                break;    
         }
    }
}
