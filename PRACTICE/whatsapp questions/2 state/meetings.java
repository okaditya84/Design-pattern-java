import java.util.*;
//time module to wait for next command
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class meetings implements googleassistant{
    public void command(Context context){
        System.out.println("Scheduling a meeting ");
        //wait for 2 seconds
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Error in waiting for next command.");
        }
        //ask user input for date and time
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date and time for meeting in dd/MM/yyyy HH:mm format");
        String date = sc.nextLine();
        //convert string to date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        //get current date and time
        LocalDateTime now = LocalDateTime.now();
        //check if date and time is valid
        if(dateTime.isAfter(now)){
            System.out.println("Meeting scheduled for "+dateTime);
        }
        else{
            System.out.println("Invalid date and time.");
        }
        context.setState(this);

    
    }
    public String toString(){
        return "Meeting state";
    }
}