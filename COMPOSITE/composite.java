import java.util.ArrayList;
public class composite {
    public static void main(String[] args) {
        restaurant veg = new veg();
        restaurant nonveg = new nonveg();
        restaurant combine = new combine();
        combine c = new combine();
        c.add(veg);
        c.add(nonveg);
        c.typeoffood();
    }
}