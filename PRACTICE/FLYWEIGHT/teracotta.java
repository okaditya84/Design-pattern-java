import java.util.*;
public class teracotta implements restaurant{
    private int tablesize;
    private int price;
    private String foodname;
    public teracotta(String foodname){
        this.foodname = foodname;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void setTableSize(int tablesize){
        this.tablesize = tablesize;
    }
    @Override
    public void servefood(){
        System.out.println("We are serving " + foodname + " at " + price + " for " + tablesize + " people.");
    }

}