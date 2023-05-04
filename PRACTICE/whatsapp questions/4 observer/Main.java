import java.util.*;
interface Observer{
    void update(String message);

}
class user implements Observer{
    private String name;
    public user(String name){
        this.name=name;
    }
    public void update(String message){
            System.out.println("["+name+"]"+ "Recieved message:"+message);
    }
} 
class messagesystem{
    private List<Observer> ob;
    public messagesystem(){
        this.ob=new ArrayList<Observer>();
    }
    public void add(Observer user){
        this.ob.add(user);
    }
    public void remove(Observer user){
        this.ob.remove(user);
    }
    public void sendmessage(Observer user,String message){
        user.update(message);
    }
    


}
public class Main{
    public static void main(String[] args) {
        messagesystem ms=new messagesystem();
        user aditya=new user("aditya");
        user khushi=new user("khushi");
        ms.add(aditya);
        ms.add(khushi);
        ms.sendmessage(aditya,"Hello");
        ms.sendmessage(khushi,"Hi");

    }
}