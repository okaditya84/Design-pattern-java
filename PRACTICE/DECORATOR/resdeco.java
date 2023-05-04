import java.util.*;
public abstract class resdeco implements restaurant{
    protected restaurant deco;
    public resdeco(restaurant deco){
        this.deco=deco;
    }
    public void foodtype(){
        deco.foodtype();
    }
}