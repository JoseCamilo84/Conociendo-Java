package Clase_09;

/*
    Crea un programa que tenga un arreglo con nombres completos de personas.
    Además, debe permitir realizar una búsqueda por el nombre de la persona
*/

import java.util.Scanner;

public class BusquedaNombre {
    public static void main(String[] args) {
        String[] nombresCompletos = {"José Camilo", "Matias Jared", "Favio Alejandro", "Rosa Annabel"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su busqueda: ");
        String busquedaNombre = scanner.nextLine();

        for (String nombrePersona : nombresCompletos) {

            if (nombrePersona.toLowerCase().contains(busquedaNombre.toLowerCase())) {
                System.out.println("El nombre de la persona es: " + nombrePersona);
            }
        }
    }
}
