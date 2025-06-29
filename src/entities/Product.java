package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

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

    public String toString(){ // o "toString" é como fosse um def __str__ em python
        return name + ", & " + String.format("%.2f", price) + ", " + quantity + " units , Total: $ " + totalValueInStock();
    }
}
