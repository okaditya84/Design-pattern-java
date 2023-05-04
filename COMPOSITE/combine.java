
import java.util.*;
public class combine implements restaurant{
    List<restaurant> restaurantList = new ArrayList<restaurant>();
    public void typeoffood(){
        for(restaurant restaurant:restaurantList){
            restaurant.typeoffood();
        }
    }
    public void add(restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public void remove(restaurant restaurant){
        restaurantList.remove(restaurant);
    }
}