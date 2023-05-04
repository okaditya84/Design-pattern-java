import java.util.*;

public class market {
    String productName;
    int price;
     boolean available;
     customer bought;
     seller sells;

    public market(customer bought, seller sells) {
        this.bought = bought;
        this.sells = sells;
    }

    private boolean getAvailability() {
        return true;
    }

    private String getName() {
        return "Bags";
    }

    private int getPrice() {
        return 1000;
    }

    public void itemspurchases() {
        productName = getName();
        price = getPrice();
        available = getAvailability();
        bought.update(productName,price,available);
        sells.update(productName,price,available);
    }
}