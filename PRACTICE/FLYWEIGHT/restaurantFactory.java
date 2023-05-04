import java.util.*;
public restaurantFactory implements restaurant{
    private static final HashMap foodMap = new HashMap();
    public static restaurant getFood(String foodMap){
        teracotta menu = (teracotta)foodMap.get(food);
        if(menu == null){
            menu = new teracotta(food);
            foodMap.put(food, menu);
            System.out.println("Creating food of type : " + food);
        }
        return menu;
    }
}   