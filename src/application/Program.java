package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double areaX, areaY, p;
        Triangle x, y;

        // a função "new" aloca dinâmicamente.
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.area();
        areaY = y.area();

        System.out.printf("Área de X: %.4f%n", areaX);
        System.out.printf("Área de Y: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Maior área é X");
        }else{
            System.out.println("Maior área é Y");
        }

        sc.close();
    }
}
