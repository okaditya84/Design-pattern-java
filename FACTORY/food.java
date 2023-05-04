import java.util.*;
public class food {
    public restaurant getName(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("Indian")){
            return new indian();
        }
        if(name.equals("italian")){
            return new italian();
        }
        return null;
    }
}