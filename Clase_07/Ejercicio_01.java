package Clase_07;

// Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int contador = 0;

        Scanner scan = new Scanner(System.in);

        /*
        while (contador < 5) {
            System.out.print("Ingrese cinco numeros: ");
            numeros[contador] = scan.nextInt();
            contador++;
        } */

        do {
            System.out.print("Ingrese cinco numeros: ");
            numeros[contador] = scan.nextInt();
            contador++;
        } while (contador < 5);

        /*
        contador = 0;
        while (contador < 5) {
            System.out.println(numeros[contador]);
            contador++;
        } */

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
}
