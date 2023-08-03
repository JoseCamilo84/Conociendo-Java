package Clase_06;

import java.util.Random;
import java.util.Scanner;

/*
    Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras"
    contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
    y luego generar una elección aleatoria para la computadora.
    Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.
*/

public class Ejercicio_04 {
    public static void main(String[] args) {
        Random random = new Random();

        int rangoMinimo = 1;
        int rangoMaximo = 3;

        int numeroAleatorio = random.nextInt((rangoMaximo - rangoMinimo) + 1) + rangoMinimo;

        String eleccionCompu = elejirOpcion(numeroAleatorio);

        System.out.println("Ingrese su eleccion:");
        System.out.println("1) Piedra");
        System.out.println("2) Papel");
        System.out.println("3) Tijeras");
        Scanner scan = new Scanner(System.in);
        System.out.print("Escriba un numero entre (1 y 3): ");
        int numeroUsuario = scan.nextInt();

        String eleccionUsuario = elejirOpcion(numeroUsuario);

        if (eleccionUsuario == eleccionCompu) {
            System.out.println("Vuelve a intentarlo...");
        } else if (eleccionUsuario == "Piedra" && eleccionCompu == "Tijeras") {
            System.out.println("Gana Usuario!!!");
        } else if (eleccionUsuario == "Piedra" && eleccionCompu == "Papel") {
            System.out.println("Gana Computadora!!!");
        } else if (eleccionUsuario == "Papel" && eleccionCompu == "Piedra") {
            System.out.println("Gana Usuario!!!");
        } else if (eleccionUsuario == "Papel" && eleccionCompu == "Tijeras") {
            System.out.println("Gana Computadora!!!");
        } else if (eleccionUsuario == "Tijeras" && eleccionCompu == "Piedra") {
            System.out.println("Gana Computadora!!!");
        } else if (eleccionUsuario == "Tijeras" && eleccionCompu == "Papel") {
            System.out.println("Gana Usuario!!!");
        }
    }

    private static String elejirOpcion(int numero) {
        String opcion = "";
        if (numero == 1) {
            opcion = "Piedra";
        }

        if (numero == 2) {
            opcion = "Papel";
        }

        if (numero == 3) {
            opcion = "Tijeras";
        }
        return opcion;
    }
}
