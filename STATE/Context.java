import java.util.*;
public class Context{
    private restaurant res;
    public Context(){
        res=null;

    }
    public void setState(restaurant res){
        this.res=res;
    }
    public restaurant getState(){
        return res;
    }
}