import java.util.*;
public class open implements restaurant{
    public void openclose(Context context){
        System.out.println("Restaurant is now open.");
        context.setState(this);
    }
    public String toString(){
        return "Open state";
    }
}