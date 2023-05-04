import java.util.*;
//time module to wait for next command
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class messages implements googleassistant{
    public void command(Context context){
        System.out.println("Sending messages to schedule meeting.");

        //wait for 2 seconds
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Error in waiting for next command.");
        }
        System.out.println("Message sent to schedule meeting.");
        context.setState(this);
    }
    public String toString(){
        return "Message state";
    }
}