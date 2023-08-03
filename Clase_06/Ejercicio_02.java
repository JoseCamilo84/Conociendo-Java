package Clase_06;

/*
    Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.
    Los libros de “Elige tu propia aventura” eran historias interactivas,
    en el que el lector en un momento podía elegir a qué página ir
*/

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        System.out.println("¿Que haras?, elije una opcion: ");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        if(opcion == 1) {
            System.out.println("Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
            System.out.println("Cada vez se escucha mas fuerte el sonido de esa voz espeluznante y cuando de pronto se me acerca algo endemoniado que comienza a morderme todo el cuerpo dejandome el cuerpo desfigurado y a punto de morir...");
        } else {
            System.out.println("Decides seguir el sendero iluminado hacia una pequeña cabaña acogedora, al llegar al lugar te das cuenta que hay 2 puertas");
            System.out.println("1) Entras por la puerta de la izquierda");
            System.out.println("2) Optas por la puerta de la derecha");
            opcion = scan.nextInt();
            if(opcion == 1) {
                System.out.println("Entras por la puerta de la izquierda");
                System.out.println("Y te encuentras con un cuarto lleno de riquezas que son para ti...");
            } else {
                System.out.println("Entras por la puerta de la derecha");
                System.out.println("Y lo que recibes son gritos de unos perros rabiosos y hambrientos que estan a punto de lanzarse hacia ti...");
            }
        }
    }
}
