package RefuerzoParte2;

import java.util.Scanner;

public class ParteII152 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Digite el tercer numero: ");
        num3 = sc.nextInt();
        System.out.println("Digite el quarto numero: ");
        num4 = sc.nextInt();

        if (num1 == num2 && num1 == num3 && num1 == num4) {
            System.out.println("Todos són iguales");
        }else {
            System.out.println("Son diferentes ");

        }
    }
}
