import java.util.*;
public class Main{
    public static void main(String[] args) {
        indianrestaurant ind=new indianrestaurant();
        chineserestaurant chin=new chineserestaurant();
        restaurantitems items=new restaurantitems(ind, chin);
        items.itemChanged();
    }
}