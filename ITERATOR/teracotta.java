import java.util.*;
public class teracotta implements restaurantcontainer{
    public String menu[]={"Pizza","Burger","Fries","Indian"};
    
    public Iterator getIterator(){
        return new teracottaiterator();
    }
    private class teracottaiterator implements Iterator{
        int index;
        public boolean hasNext(){
            if(index<menu.length ){
                return true;
            }
            return false;

        }
        public Object next(){
            if(this.hasNext()){
                return menu[index++];
            }
            return null;
        }
    }
}
