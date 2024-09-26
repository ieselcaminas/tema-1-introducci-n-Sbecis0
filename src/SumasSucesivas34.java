

import java.util.Scanner;

public class SumasSucesivas34 {
    public static void main(String[] args) {

        int num;
        int num2;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("Enter another number");
        num2 = sc.nextInt();


        for (int i = 1; i <= num2; i++){
            total = total + num;

        }
        System.out.println(total);


    }
}
