import java.util.*;
class chef{
    private String name;
    private String position;
    private int salary;
    private List<chef> staff;
    public chef(String name, String position, int salary){
        this.name=name;
        this.position=position;
        this.salary=salary;
        staff= new ArrayList<chef>(0);    }
    public void add(chef c){
        staff.add(c);
    }
    public void remove(chef c){
        staff.remove(c);
    }
    public List<chef> getlist(){
        return staff;
    }
    public String toString(){
        return("Chef : [Name: "+ name + "Position: " + position + "Salary:" + salary + "]");
    }
    
}

public class composite{
    public static void main(String[] args) {
        chef headChef=new chef("Aditya","Head-Chef",69000);
        chef sousChef=new chef("Vidhi","Sous-Chef",42000);
        chef helpChef=new chef("Het","Helper Chef",33000);
        chef waiter1=new chef("ABC","Waiter 1",29000);
        chef waiter2=new chef("DEF","Waiter 2",29000);
        headChef.add(sousChef);
        sousChef.add(helpChef);
        headChef.add(waiter1);
        helpChef.add(waiter2);
        System.out.println(headChef);
        for(chef people: headChef.getlist()){
            System.out.println(people);
            for(chef cooks: people.getlist()){
                System.out.println(cooks);
            }
        }
        
    }
}