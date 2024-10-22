package Tema2;

import java.util.Arrays;
import java.util.Scanner;

public class Divisores31 {

    // Función para calcular los divisores de un número natural
    public static int[] calcularDivisores(int numero) {
        // Primero contamos cuántos divisores tiene el número para crear un array del tamaño correcto
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        // Creamos un array para almacenar los divisores
        int[] divisores = new int[contador];
        int indice = 0;

        // Llenamos el array con los divisores del número
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores[indice] = i;
                indice++;
            }
        }

        return divisores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un número natural: ");
        int numero = scanner.nextInt();


        if (numero <= 0) {
            System.out.println("Error: El número debe ser un natural positivo.");
        } else {

            int[] divisores = calcularDivisores(numero);


            System.out.print("Los divisores de " + numero + " son: " + Arrays.toString(divisores));
//
        }

        scanner.close();
    }
}

