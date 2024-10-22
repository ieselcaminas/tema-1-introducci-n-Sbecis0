package Tema2;

import java.util.Scanner;

public class EsDivisible {

    public static boolean esDivisible(int n, int m) {
        return n % m == 0;
    }

    public static void main(String[] args) {

        int n ;
        int m ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Intruduce tu primer numero : ");
        n = sc.nextInt();
        System.out.print("Intruduce tu segundo numero : ");
        m = sc.nextInt();


        if (esDivisible(n, m)) {
            System.out.println(n + " es divisible por " + m);
        } else {
            System.out.println(n + " no es divisible por " + m);
        }
    }
}
