import java.util.Scanner;

public class RadarTramo {
    public static void main(String[] args) {

        double metros;
        double seg;
        double vMax;
        double hora;
        double media;
        double km;

        Scanner input = new Scanner(System.in);
        System.out.println(" Distancia en metros: ");
        metros = input.nextInt();
        System.out.println(" Distancia en vMax: ");
        vMax = input.nextInt();
        System.out.println(" Tiempo en seg: ");
        seg = input.nextInt();

        km = metros / 1000;
        hora = seg / 3600;
        media = km/hora;


        if (media > vMax) {
            System.out.println("multa");
        }else
            System.out.println("ok");

    }
}

