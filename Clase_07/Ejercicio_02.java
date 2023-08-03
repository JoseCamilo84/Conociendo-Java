package Clase_07;

// Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int contador = 0;
        int sumatoria = 0;
        float promedio = 0;

        Scanner scan = new Scanner(System.in);

        while (contador < numeros.length) {
            System.out.print("Ingrese cinco numeros: ");
            numeros[contador] = scan.nextInt();
            contador++;
        }

        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            sumatoria = sumatoria + numeros[i];
            promedio = (float) sumatoria / numeros.length;
        }

        System.out.println("El promedio es: " + promedio);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
