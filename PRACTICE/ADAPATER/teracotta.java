import java.util.*;
public class teracotta implements restaurant{
    resadapt yumm;
    public void foodtype(String type, String name){
        if(type.equalsIgnoreCase("main course")){
            System.out.println("Restaurant is preparing: "+name);
        }
        else if (type.equalsIgnoreCase("snacks")||type.equalsIgnoreCase("beverage")){
            yumm=new resadapt(type);
            yumm.foodtype(type,name);

        }
        else{
            System.out.println("No such item is made");
        }
    }
}