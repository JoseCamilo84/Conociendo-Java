package Clase_05;

import java.util.Scanner;

/*
    2) Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.

*/
public class Ejercicio_02 {
    public static void main(String[] args) {
        System.out.print("Ingrese una distancia en millas: ");
        Scanner scan = new Scanner(System.in);
        float distanciaMillas = scan.nextFloat();
        double distanciaKilometros = distanciaMillas * 1.60934;
        System.out.println("La distancia en kilometros es: " + distanciaKilometros);
    }
}
