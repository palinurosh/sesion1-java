package com.example;
import java.util.Scanner;

public class ejercicioSesionDos {
    //ejercicio de final de sesión. Evaluable
    /*
    crear función que recibe un parámetro y devuelva precio con iva incluido
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula el iva a partir de un precio base dado\n");
    System.out.println("Introduce el precio base del artículo: ");
    double precioSin = s.nextDouble();

    System.out.println("Introduce el porcentaje a aplicar: ");
    double porcentaje = s.nextDouble();

    double entregaDomicilio = 8;
    double total = soloIva(precioSin, porcentaje);
    double total1 = ivaYMas(precioSin, porcentaje, entregaDomicilio);


    System.out.println("El precio del producto es: \t"
                + precioSin + " €" + "\nEl IVA es: \t" + porcentaje + " % " + "\nY los gastos de envío son de : " + entregaDomicilio + " €");
    System.out.println("\nTotal a pagar: \t" + total + " €" + " Si quieres ahorrar algo...");
        System.out.println("o bien");
    System.out.println("Total a pagar: \t" + total1 + " €" + " Si eliges entrega en domicilio...");

    }
    public static double soloIva(double precioSin1, double porcentaje1) {
        return (precioSin1 * porcentaje1 / 100) + precioSin1;
    }

    public static double ivaYMas(double precioSin1, double porcentaje1, double gastosEnvio) {
        return (precioSin1 * porcentaje1 / 100) + precioSin1 + gastosEnvio;
    }


    }


