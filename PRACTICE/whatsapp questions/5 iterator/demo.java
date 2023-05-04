import java.util.*;
//define INT_MAX 100000

public class demo{
    public static void main(String[] args) {
        travelcost tc=new travelcost();
        //find the minimum cost of travel from the hashmap
        int mincost =Integer.MAX_VALUE;
        for(iterator iter=tc.getIterator();iter.hasNext();){
            int cost=(int)iter.next();
            if(cost<mincost){
                mincost=cost;
            }
        }
        System.out.println("mincost is"+mincost);



    }
}