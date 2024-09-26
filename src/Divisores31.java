import java.util.Scanner;

public class Divisores31 {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.println(+i+ " és divisor de " +num1);
            }
        }
    }
}
.