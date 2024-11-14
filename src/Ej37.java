import java.util.Scanner;

public class Ej37 {
    public static void main(String[] args) {

        double resultado = 0;
        double decimal = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce binario: ");
        String binario = sc.nextLine();

        for (int i = 0; i < binario.length();i++ ) {
            int bit = binario.charAt(binario.length() - 1 - i) - '0';

            resultado = resultado + bit * Math.pow(2, i);

        }
        System.out.println(resultado);

    }
}
