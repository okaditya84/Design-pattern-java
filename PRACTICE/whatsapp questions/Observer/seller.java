import java.util.*;

public class seller {
    private String productName;
    private int price;
    private boolean available;

    public void update(String productName, int price, boolean available) {
        this.productName = productName;
        this.price = price;
        this.available = available;
        display();
    }

    public void display() {
        System.out.println("The customer bought: " + productName + " each at a price of: " + price + ". Availability of the items now: " + !available);
    }
}
