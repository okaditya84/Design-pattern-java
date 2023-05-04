import java.util.*;
public class travelcost implements transcontainer{
    private HashMap<String,Integer> costmap=new HashMap<String,Integer>();
    public travelcost(){
        costmap.put("bus",10);
        costmap.put("train",20);
        costmap.put("flight",30);
    }
    public iterator getIterator(){
        return new costiterator();
    }
    private class costiterator implements iterator{
        int index;
        public boolean hasNext(){
            if(index<costmap.size()){
                return true;
            }
            return false;
        }
        public Object next(){
            if(this.hasNext()){
                return costmap.get(index++);
            }
            return null;
        }
    }
}
