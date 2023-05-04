import java.util.*;
public class food{
    public restaurant name(String n){
        if(n==null){
            return null;
        }
        if(n.equalsIgnoreCase("indian")){
            return new indian();
        }
        if(n.equalsIgnoreCase("italian")){
            return new italian();
        }
        return null;
    }
}