import java.util.Scanner;

public class NotaMedia24 {
    public static void main(String[] args) {

        int nota;

        int c = 0;

        int sumaNotas = 0;

        boolean hayUnDiez = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sus nota: ");


        do {
            nota = input.nextInt();
            if (nota != -1) {
                sumaNotas += nota;
                c++;
            }

        } while (nota != -1);
        System.out.println("Su media es " + (sumaNotas / c));
        if (nota == 10)
            hayUnDiez = true;
        System.out.println("hya un diez");

    }
}
