import java.util.*;
public class close implements restaurant{
    public void openclose(Context context){
        System.out.println("The Restaurant is now closed.");
        context.setState(this);
    }
    public String toString(){
        return "Closed state";
    }
}