import java.util.*;
public class Context{
    private googleassistant GA;
    public Context(){
        GA=null;

    }
    public void setState(googleassistant GA){
        this.GA=GA;
    }
    public googleassistant getState(){
        return GA;
    }
}