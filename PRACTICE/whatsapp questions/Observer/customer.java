import java.util.*;

public class customer {
    private String name;
    private int quantity;
    private boolean billed;

    public void update(String productName, int price, boolean available) {
        this.name = productName;
        this.quantity = price / 4;
        this.billed = available;
        display();
    }

    public void display() {
        System.out.println("You bought: " + name + ". Quantity: " + quantity + ". Your billed status: " + billed);
    }
}
