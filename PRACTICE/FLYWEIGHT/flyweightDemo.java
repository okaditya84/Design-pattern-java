import java.util.*;
import java.math.*;
public class flyweightDemo{
    private static final String foods[]={"Chinese","Indian","Italian","Mexican","Thai"};
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            teracotta menu =(teracotta)restaurantFactory.getFood(getRandomFood());
            menu.setPrice(getRandomPrice());
            menu.setTableSize(getRandomTableSize());
            menu.servefood();

        }
        private static String getRandomFood(){
            return foods[(int)(Math.random()*foods.length)];

        }
        private static int getRandomPrice(){
            return (int)(Math.random()*100);
        }
        private static int getRandomTableSize(){
            return (int)(Math.random()*10);
        }
        
    }  
}