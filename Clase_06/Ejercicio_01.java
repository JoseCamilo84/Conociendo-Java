package Clase_06;

/*
    Arma un buscador de países con Google Maps.
    Primero, pidele al usuario que ingrese un país (Ej: Colombia).
    Después muestra en consola la concatenación de:
    “https://www.google.com/maps/search/” + pais
    Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
*/

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        System.out.print("Ingrese un pais: ");
        Scanner scan = new Scanner(System.in);
        String pais = scan.next();

        System.out.println("Click en el link");
        System.out.println("https://www.google.com/maps/search/" + pais);
    }

}
