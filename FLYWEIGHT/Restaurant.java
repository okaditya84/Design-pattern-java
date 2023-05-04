import java.util.*;
import java.util.Random;
interface table{
    public void task();
}

class customer implements table{
    private final String task;
    public customer(){
        task="eat food";
    }   
    public void task(){
        System.out.println("Customer is here to "+task);
    }
}

class chef implements table{
    private final String task;
    public chef(){
        task="cook food";
    }
    public void task(){
        System.out.println("Chef is here to "+task);
    }
}
//the Restaurant class used to get a person using Hashmap and returns a person if it exists 
//else creates a new person and returns it
class personFactory{
    private static HashMap <String,table> personMap=new HashMap<String,table>();
    //creating a method to get a table
    public static table gettTable(String type){
        table t=personMap.get(type);
        if(personMap.containsKey(type)){
            t=personMap.get(type);
        }
        else {
            switch(type){
                case "customer":
                    System.out.println("Customer arrived");
                    t=new customer();
                    break;
                case "chef":
                    System.out.println("Chef has arrived!");
                    t=new chef();
                    break;
                default:
                    System.out.println("No one has arrived");
                    
            personMap.put(type,t);
            }


            }
            return t;
        }
        
    }
public class Restaurant{
    private static final String[] personTypes={"customer","chef","no"};
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            table t=personFactory.gettTable(getRandomPerson());
            t.task();

        }
        
    }
    public static String getRandomPerson(){
        Random r =new Random();
        int randInt=r.nextInt( personTypes.length);
        return personTypes[randInt];  
    }
}
