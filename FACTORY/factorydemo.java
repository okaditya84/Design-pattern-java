import java.util.*;
public class factorydemo {
    public static void main(String[] args) {
        food f=new food();
        indian i=f.getName("indian");
        i.food();
        italian it=f.getName("italian");
        it.food();
    }
}