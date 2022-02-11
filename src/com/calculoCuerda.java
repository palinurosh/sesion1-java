package com;
//esta función calcula la longitud de cuerda de un círculo
public class calculoCuerda {
    public static void main(String[] args) {

        double dospi = 3.1416 * 2;
        double radio = 6;
        double perimetro = cuerda(dospi, radio);
        System.out.println("La cuerda de tu círculo mide: " + perimetro + " cm");
    }


    static double cuerda(double dospi, double radio){
        return dospi * radio;
    }
}