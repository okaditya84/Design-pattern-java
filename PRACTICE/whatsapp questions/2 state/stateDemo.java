import java.util.*;
public class stateDemo{
    public static void main(String[] args) {
        Context context=new Context();
        messages text=new messages();
        text.command(context);
        System.out.println(context.getState().toString());
        meetings meet=new meetings();
        meet.command(context);
        System.out.println(context.getState().toString());

    }
}