import java.util.*;
//creating a concrete decorator class AC for giving AC facility to the restaurant
public class AC extends restaurantdecorator{
    public AC(restaurant decoratedrestaurant){
        super(decoratedrestaurant);
    }
    public void foodtype(){
        decoratedrestaurant.foodtype();
        ACfacility(decoratedrestaurant);
    }
    private void ACfacility(restaurant decoratedRestaurant){
        System.out.println("AC facility is available");
    }
}