import java.util.*;
public class facaderestaurant{
    private restaurant ind;
    private restaurant chin;
    public facaderestaurant(){
        ind= new indian();
        chin=new chinese();

    }
    public void indianmaker(){
        ind.typeoffood();
    }
    public void chinesemaker(){
        chin.typeoffood();
    }

}