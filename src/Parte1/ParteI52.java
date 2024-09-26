package Parte1;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ParteI52 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        boolean combrobacion;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = sc.nextInt();
        System.out.println("Digite el tercer numero");
        num3 = sc.nextInt();

        combrobacion = (num1 + num2) == num3;
        if (combrobacion) {
            System.out.println("es correcto");
        }else
            System.out.println("no es correcto");



    }
}
