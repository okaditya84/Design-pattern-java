

import java.util.*;
public class decoratordemo{
    public static void main(String[] args) {
    restaurant veg =new veg();
    restaurant vegAc=new concreteAc(new veg());
    restaurant nonVegAc=new concreteAc(new nonveg());
    System.out.println("Veg restaurant");
    veg.foodtype();
    System.out.println("Functionality");
    vegAc.foodtype();
    System.out.println("Non veg restaurant also has");
    nonVegAc.foodtype();
    }
    

}