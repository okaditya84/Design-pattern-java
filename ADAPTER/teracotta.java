import java.util.*;
public class teracotta implements restaurant{
    restaurantadapter menu;
    public void foodtype(String type){
        if(type.equalsIgnoreCase("Cusine")){
            System.out.println("This reaturant has multi cusine food");
        }
        else if (type.equalsIgnoreCase("aloopuri")|| type.equalsIgnoreCase("coffee")){  
            menu= new restaurantadapter(type);
            menu.foodtype(type);

        }
        else{
            System.out.println("This reaturant has no such food");
        }
    }
}