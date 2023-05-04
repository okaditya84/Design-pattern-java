import java.util.*;
public class IteratorDemo
{
    public static void main(String[] args)
     {
        
        teracotta t=new teracotta();
        for(Iterator iter=t.getIterator();iter.hasNext();)
        {
            String item=(String)iter.next();
            System.out.println(item);

        }
    }
}