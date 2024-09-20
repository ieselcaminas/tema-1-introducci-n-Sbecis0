import java.util.Scanner;

public class NúmeroPositivosII {
    public static void main(String[] args) {
        int num;
        int positive = 0;

        Scanner entrada = new Scanner(System.in);
        do {
            num = entrada.nextInt();
            if (num >= 0) {
                positive ++;

            }

        }while (num != 0);
        System.out.println("positivos " +positive);

    }
}
