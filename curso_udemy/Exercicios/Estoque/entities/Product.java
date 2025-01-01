package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return  "__________\n"
        + "Product data: \n" 
        + "Name: "+ name + "\n"
        +"Price: $"+String.format("%.2f", price) + "\n"
        + "Quantity: "+quantity + "\n" 
        +"TOTAL: $"+String.format("%.2f", (price * quantity));
    }
}
