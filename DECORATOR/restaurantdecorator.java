import java.util.*;
//this class is abstract to wrap more functionalities to the restaurant interface without 
//changing them by making a protected variable of type restaurant and passing it to the constructor
public abstract class restaurantdecorator implements restaurant{
    
    protected restaurant decoratedrestaurant;
    public restaurantdecorator(restaurant decoratedrestaurant){
        this.decoratedrestaurant = decoratedrestaurant;
    }
    public void foodtype(){
        decoratedrestaurant.foodtype();
    }

}