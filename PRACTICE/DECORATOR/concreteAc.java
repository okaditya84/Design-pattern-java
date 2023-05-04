import java.util.*;
public class concreteAc extends resdeco{
    public concreteAc(restaurant deco){
        super(deco);
    }
    public void foodtype(){
        deco.foodtype();
        ACfacility(deco);
    }
    private void ACfacility(restaurant deco){
        System.out.println("This restaurant has AC!");
    }
}
