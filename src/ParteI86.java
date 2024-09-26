import java.util.Scanner;

public class ParteI86 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        do{
            if (num % 2 == 0) {
                num /= 2;
                System.out.println(num);
            }else if (num % 2 == 1);
                num+=3;
                num++;
            System.out.println(num);
        }while (num == 1);
         sc.close();



    }
}
