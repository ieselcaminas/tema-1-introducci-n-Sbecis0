package Tema2;

import java.util.Scanner;

public class EsTriangulo {

    public static boolean esTriangulo(int a, int b, int c) {

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del primer palito: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa la longitud del segundo palito: ");
        int b = scanner.nextInt();

        System.out.print("Ingresa la longitud del tercer palito: ");
        int c = scanner.nextInt();


        if (esTriangulo(a, b, c)) {
            System.out.println("Sí, es posible formar un triángulo con esas longitudes.");
        } else {
            System.out.println("No, no es posible formar un triángulo con esas longitudes.");
        }

        scanner.close();
    }
}
