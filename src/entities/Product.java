package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){

    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        // a palavra "this" refere-se ao objeto da classe Product
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // encapsulamento (setter e getter)
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String toString(){ // o "toString" é como fosse um def __str__ em python
        return name + ", & " + String.format("%.2f", price) + ", " + quantity + " units , Total: $ " + totalValueInStock();
    }
}
