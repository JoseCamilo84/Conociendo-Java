package Clase_05;

import java.util.Scanner;

/*
    1) Calculadora de edad de perros:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro)
*/

public class Ejercicio_01 {
    public static void main(String[] args) {
        System.out.print("(1 año humano equivale a 7 años de perro) ¿Cuantos años tiene su perro?: ");
        Scanner scan = new Scanner(System.in);
        int añoHumano = scan.nextInt();
        int añoPerro = añoHumano * 7;
        System.out.println("Tu perro tiene " + añoPerro + " años de perro");

    }
}
