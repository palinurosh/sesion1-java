package com.example;
import java.util.Scanner;

public class CalculoIva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double precioInicial = 6;
        double iva = precioInicial * 21 / 100;
        double precioFinal = calcIva(precioInicial, iva);
        System.out.println(precioFinal);
    }
    static double calcIva(double precioInicial, double iva){

        return precioInicial + iva;
}
}