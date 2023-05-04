// View
import java.util.List;

public class MenuView {
    public void displayMenu(String foodType, List<Food> menuItems) {
        System.out.println("-----" + foodType.toUpperCase() + " MENU------");
        for (Food food : menuItems) {
            System.out.println(food.getName());
        }
        System.out.println("-----------------------");
    }
} 