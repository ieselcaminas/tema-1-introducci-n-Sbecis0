import java.util.Scanner;

public class Prueba1{
    public static void main(String[] args) {

        int num;

        int positive = 0;


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            num = sc.nextInt();
            if (num > 0) {
                positive ++;


            }
        }
        System.out.println("Positivos " +positive);
    }
}

