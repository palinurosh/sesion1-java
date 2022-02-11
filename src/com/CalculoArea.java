package com;
//esta función calcula el área de un círculo
/*
Bajo la función main se declaran las variables que usará la función. Su valor puede ser cambiado. La función aplica
la operación que tenga guardada sobre los valores que tengan las variables en el momento de su invocación.
 */
import java.util.Scanner;

public class CalculoArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//se inicializa Scanner dentro de main. Si se hace fuera da error

        System.out.println("Introduce el radio de tu círuclo");
        double radio = scan.nextDouble();
        double pi = 3.1416;
        //double radio = 3;
        double area = getArea(pi, radio);//se asigna a la función getarea el nombre de variable area
        System.out.println("El área de tu círculo mide: \n\t" + area + " cm");
    }
    /*
    La función se crea fuera de main porque no declara variables, sólo define qué operación
    se les aplica
     */
    static double getArea(double pi, double radio){//al no ser void hay que declarar qué tipo de dato va a devolver
        return pi * (radio * radio);               //en este caso double.
    //los parámetros de la función van entre paréntesis y son los que se declaran dentro de main, en este caso
    //son las variables pi y radio

    }
}
