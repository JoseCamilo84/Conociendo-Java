package Clase_05;

/*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Double numeroAleatorio = Math.random() * 100;
        Long numeroRedondeado = Math.round(numeroAleatorio);

        System.out.print("Adivine el numero: ");
        Scanner scan = new Scanner(System.in);
        Long numero = scan.nextLong();

        if(numeroRedondeado == numero) {
            System.out.println("Adivinaste!!");
        } else {
            System.out.println("Lastima... No pudiste adivinar");
        }

    }
}
