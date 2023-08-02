package Clase_05;

/*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el total de la cuenta del restaurante: ");
        Float totalCuenta = scan.nextFloat();

        System.out.print("Ingrese el porcentaje de propina que desea dejar (%): ");
        Float porcentajePropina = scan.nextFloat();

        Float propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El monto de la propina es: " + propina);
    }
}
