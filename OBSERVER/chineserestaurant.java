import java.util.*;
public class chineserestaurant{
    private int price;
    private String name;
    public void update(int price,String name){
        this.price=price;
        this.name=name;
        display();
    }
    public void display(){
        System.out.println("The indian restaurant has: "+name+"\n They cost: "+price);
    }
}