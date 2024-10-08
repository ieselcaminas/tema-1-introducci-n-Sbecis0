import java.util.Scanner;

public class chat19 {
    public static void main(String[] args) {

        int precioHora;
        int numHoras;
        double salarioBruto = 0;
        double salarioNeto = 0;
        double impuestos = 0;


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de horas: ");
        numHoras = entrada.nextInt();
        System.out.print("Ingrese el precio de hora: ");
        precioHora = entrada.nextInt();

        // Cálculo del salario bruto
        if (numHoras <= 35) {
            salarioBruto = numHoras * precioHora;
        } else {
            salarioBruto = (35 * precioHora) + ((numHoras - 35) * (precioHora * 1.5));
        }
        System.out.println("El salario bruto es: " + salarioBruto);

        // Cálculo de impuestos
        if (salarioBruto > 900) {
            impuestos = (salarioBruto - 900) * 0.45 + (400 * 0.25);  // 45% sobre el excedente de 900, y 25% sobre la parte entre 500 y 900
        } else if (salarioBruto > 500) {
            impuestos = (salarioBruto - 500) * 0.25;  // 25% sobre el excedente de 500
        }

        // Cálculo del salario neto
        salarioNeto = salarioBruto - impuestos;
        System.out.println("El salario neto es: " + salarioNeto);
        System.out.println("El impuesto total es: " + impuestos);
    }
}
