package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Triangle;
import entities.Product;

public class Program {
    static {Locale.setDefault(Locale.US);}
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("(1)-Exercício 1\n(2)Exercício 2\n(3)Exercício 3\n(4)Exercício 4\n(0)Sair");
            System.out.print("Escolha uma opção: ");
            int opt = sc.nextInt();
            if(opt == 1){
                ex1();
            }else if(opt == 2) {
                ex2();
            }else if(opt == 3) {
                ex3();
            }else if(opt == 4){
                ex4();
            }else if(opt == 0){
                break;
            }
        }
    }

    public static void ex1(){
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
    }

    public static void ex2(){
        Product product = new Product();

        System.out.println("Enter product data: ");

        sc.nextLine();

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: %s%n", product); // or System.out.println("Product Data: %s%n", product.toString);

        System.out.print("Enter the number of products to be add in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);

        System.out.printf("Updated data: %s%n", product);

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);

        System.out.printf("Updated data: %s%n", product);
    }

    public static void ex3(){
        Rectangle rectangle = new Rectangle();

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA: %f", rectangle.area());
        System.out.printf("PERIMETER: %f", rectangle.perimeter());
        System.out.printf("DIAGONAL: %f", rectangle.diagonal());
    }

    public static void ex4(){
        Employee emp = new Employee();
        sc.nextLine();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee " + emp);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        emp.increaseSalary(percentage);

        System.out.println("Updated data: " + emp);
    }
}
