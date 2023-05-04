import java.util.*;
//creating the main demo for decorator pattern
public class decoratorDemo {
    public static void main(String[] args) {
        restaurant veg = new veg();
        restaurant vegAc=new AC(new veg());
        restaurant nonvegAc=new AC(new Nonveg());
        System.out.println("Veg restaurant ");
        veg.foodtype();
        System.out.println("Veg restaurant with AC facility");
        vegAc.foodtype();
        System.out.println("Nonveg restaurant with AC facility");
        nonvegAc.foodtype();



    }
}