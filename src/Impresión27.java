import java.util.Scanner;

public class Impresión27 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
