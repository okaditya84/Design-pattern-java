import java.util.*;
public class stateDemo{
        public static void main(String[] args) {
            Context context =new Context();
            open o=new open();
            o.openclose(context);
            System.out.println(context.getState().toString());
            close c=new close();
            c.openclose(context);
            System.out.println(context.getState().toString());

        }
}