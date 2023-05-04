import java.util.*;
public class resadapt implements restaurant{
    streetfood yumm;
    public resadapt(String type){
        if(type.equalsIgnoreCase("snacks")){
            yumm=new dhaba();
        }
        else if (type.equalsIgnoreCase("beverage")){
            yumm=new canteen();

        }
        
    }
    @Override
    public void foodtype(String type, String name){
        if(type.equalsIgnoreCase("snacks")){
            yumm.snacks(name);

        }
        else if (type.equalsIgnoreCase("beverage")){
            yumm.beverage(name);
        }
        
    }
}