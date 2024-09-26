
import java.util.Scanner;

import java.util.Scanner;

public class RestaSucesiva34 {
    public static void main(String[] args) {

        int num;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("Enter another number");
        num2 = sc.nextInt();

        do {
                num = num - num2;
            } while (num >= num2);
        System.out.println("El resultado es " + num);


    }
}
