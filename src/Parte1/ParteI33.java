package Parte1;

import java.util.Scanner;

public class ParteI33 {
    public static void main(String[] args) {
        int num1;
        int total =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();

        while (num1 >= 10) {
            total += num1 % 10;
                    num1/= 10;
        }
        System.out.println("Total de valores: " +total);
    }
}
