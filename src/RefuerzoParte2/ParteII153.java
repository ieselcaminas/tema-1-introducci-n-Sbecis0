package RefuerzoParte2;

import java.util.Scanner;

public class ParteII153 {
    public static void main(String[] args) {
        double num;
        double num2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        num = entrada.nextDouble();
        System.out.println("Digite otro numero: ");
        num2 = entrada.nextDouble();

        if (num >= 0 && num2 >=0 && num <= 1 && num2 <= 1) {
            System.out.println("Estan entre el 0 y el 1 ");
        }else
            System.out.println("no estan entre el 0 y el 1 ");
    }
}
