package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Triangle;
import entities.Student;
import entities.Product;
import entities.Bank;

public class Program {
    static {Locale.setDefault(Locale.US);}
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("(1)-Exercício 1\n(2)Exercício 2\n(3)Exercício 3\n(4)Exercício 4\n(5)Exercício 5\n(6)Exercicio 6\n(7)Exercício 7\n(0)Sair");
            System.out.print("Escolha uma opção: ");
            int opt = sc.nextInt();
            if(opt == 1){
                ex1();
            }else if(opt == 2) {
                ex2();
            }else if(opt == 3) {
                ex3();
            }else if(opt == 4) {
                ex4();
            }else if(opt == 5) {
                ex5();
            }else if(opt == 6) {
                ex6();
            }else if(opt == 7){
                ex7();
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
        System.out.println("Enter product data: ");
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        // encapsulamento
        // 1- name
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        // 2- price
        product.setPrice(1000.00);
        System.out.println("Updated price: " + product.getPrice());

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

    public static void ex5(){
        Student n = new Student();
        sc.nextLine();

        System.out.print("Nome: ");
        n.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        n.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        n.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        n.nota3 = sc.nextDouble();

        n.approvad();
    }

    public static void ex6(){
        System.out.print("Enter account number: ");
        int account = sc.nextInt();

        System.out.print("Enter account holder: ");
        String name = sc.next();

        System.out.print("Is there na initial deposit (y/n)? ");
        char opt = sc.next().charAt(0);

        Bank bank;
        if(opt == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            bank = new Bank(account, name, deposit);
        }else{
            bank = new Bank(account, name);
        }

        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();
        bank.deposit(value);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        bank.take(value);
        System.out.println("Updated account data: ");
        System.out.println(bank);
    }

    public static void ex7(){
        int qnt = sc.nextInt();
        double[] vect = new double[qnt];

        for(int i=0; i<qnt; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i=0; i<qnt; i++){
            sum+=vect[i];
        }

        double media = sum / qnt;

        System.out.printf("SUM: %.2f\n", media);
    }
}
