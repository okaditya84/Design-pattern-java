import java.util.*;
public class restaurantitems{
    int price;
    String name;
    indianrestaurant ind;
    chineserestaurant chin;
    public restaurantitems(indianrestaurant ind,
    chineserestaurant chin){
            this.ind=ind;
            this.chin=chin;
    }
    private int getPrice(){
        return 100;
    }
    private String getName(){
        return "Aloopuri";

    }
    public void itemChanged(){
        price=getPrice();
        name=getName();
        ind.update( price,name);
        chin.update(price,name);

    }
}