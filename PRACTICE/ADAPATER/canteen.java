import java.util.*;
public class canteen implements streetfood{
    @Override
    public void beverage(String name){
        System.out.println("Canteen is preparing: "+name);
    }
    @Override
    public void snacks(String name){}
}