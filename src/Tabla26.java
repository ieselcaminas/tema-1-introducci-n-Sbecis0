import java.util.Scanner;

public class Tabla26 {
    public static void main(String[] args) {

        int num;
        long mult = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();

        for (int i = 1;
             i <= 10;
             i++) {System.out.println( + num + " x " +i+ " == "  +num * +i );

        }

    }
}
