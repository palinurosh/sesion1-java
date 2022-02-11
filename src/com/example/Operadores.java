package com.example;

public class Operadores {
    public static void main(String[] args) {

        //aritméticos
        int numero1 = 22;
        int numero2 = 21;
        System.out.println(numero1 + numero2);
                                                //intentar no duplicar código
        int sumatotal = numero1 + numero2;//se evita duplicar numero1 y numero2
        System.out.println(sumatotal);

        int restatotal = numero1 - numero2;
        System.out.println(restatotal);


        /*
        > mayor que
        > menor que
        >= mayor o igual que
        >= menor o igual que
        == igual que
         */
        boolean resultado = numero1 > numero2;
        System.out.println(resultado);
        boolean resultado1 = numero2 > numero1;
        System.out.println(resultado1);

        /*
        Lógicos
        && and
        || or
         */

        boolean resultado3 = numero1 > 4 && numero1 < 12;

        int edad = 17;
        boolean carnetJoven = edad > 14 && edad <= 26;

    }
}
