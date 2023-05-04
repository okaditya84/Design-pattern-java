import java.util.*;
public class indianrestaurant{
    private String rawmaterial;
    private int timetomake;
    public void update(int price,String name){
        this.rawmaterial=  name+"onions";
        this.timetomake=price*10;
        display();
    }  
    public void display(){
        System.out.println("Details of the dish:\n"+"Food you will get: "+rawmaterial+"\nThe time required to make: "+timetomake);
    }

}