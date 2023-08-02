package Clase_05;

import java.util.Scanner;

/*
    3) Calculadora de descuento:
    Pídele al usuario que ingrese el precio original de un producto.
    Pídele al usuario que ingrese el porcentaje de descuento.
    Calcula el precio final después de aplicar el descuento utilizando la
    fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
    Muestra el precio final al usuario

*/
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        Float precioOriginal = scan.nextFloat();

        System.out.print("Ingrese el porcentaje de descuento (%): ");
        Integer porcentajeDescuento = scan.nextInt();

        Float descuento = (precioOriginal * porcentajeDescuento) / 100;
        Float precioFinal = precioOriginal - descuento;

        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
