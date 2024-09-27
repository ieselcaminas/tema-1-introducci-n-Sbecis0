import java.util.Scanner;

public class SIoNO {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of mun: ");
        num = sc.nextInt();


        if ( num < 3 ) {
            System.out.println("no hay treboles de cuatro");
        }else if ( num >= 4 ) {
            System.out.println("hay " +num/4);
        }

    }
}
