import java.util.*;

public class Main {
    public static void main(String[] args) {
        customer cust = new customer();
        seller sell = new seller();
        market shop = new market(cust, sell);
        shop.itemspurchases();
    }
}





