import java.util.*;
public class restaurantadapter implements restaurant{
    streetfood  snacks;
    public restaurantadapter(String type){
        if(type.equalsIgnoreCase("dhaba")){
            snacks = new dhaba();
        }
        else if(type.equalsIgnoreCase("canteen")){
            snacks = new canteen();
        }

    }
    public void foodtype(String type){
        if(type.equalsIgnoreCase("dhaba")){ 
            snacks.snacks("aloopuri");
        }
        else if(type.equalsIgnoreCase("canteen")){
            snacks.snacks("coffee");
        }
        else{
            System.out.println("This reaturant has no such food");
        }

    }

}