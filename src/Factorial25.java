import java.util.Scanner;

public class Factorial25 {
    public static void main(String[] args) {

        long factorial = 1;
        int num1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num1 = sc.nextInt();

        for (int i = 1;
             i <= num1;
             i++) {
            factorial = factorial * i;
        }
            System.out.println("El factorial de " +num1 + " és " + factorial);




    }


}
