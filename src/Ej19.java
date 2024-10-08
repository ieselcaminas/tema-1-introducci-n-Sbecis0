import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {

        int precioHora;
        int numHoras;
        double salario = 0;
        double impuestos1 = 0;
        double impuestos2 = 0;


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de horas: ");
        numHoras = entrada.nextInt();
        System.out.print("Ingrese el precio de hora: ");
        precioHora = entrada.nextInt();

        if (numHoras < 35) {
            salario = (numHoras * precioHora);
        } else
        {
            salario = ((35 * precioHora) + (numHoras -35) * (precioHora * 1.5));
        }
        System.out.println("El salario bruto es: " + salario);

        if (salario > 900) {
            impuestos1 = salario - 900;
            salario = salario - impuestos1;
        }
        if (salario > 500) {
            impuestos2 = salario - 500;
            salario = salario - impuestos2;
            }
        salario = (impuestos1 * 0.55 + impuestos2 * 0.75) + salario;
        System.out.println("El salario neto es: " + salario);
        float v = (float) (impuestos1 * 0.45 + impuestos2 * 0.25);
        System.out.println("El impuestos es: " + v);

    }
}
