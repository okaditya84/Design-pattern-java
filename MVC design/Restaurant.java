import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        // create the model objects
        Food vegItem1 = new Food("Veg Item 1", "Veg");
        Food vegItem2 = new Food("Veg Item 2", "Veg");
        List<Food> vegMenu = new ArrayList<>();
        vegMenu.add(vegItem1);
        vegMenu.add(vegItem2);

        Food nonVegItem1 = new Food("Non-Veg Item 1", "Non-Veg");
        Food nonVegItem2 = new Food("Non-Veg Item 2", "Non-Veg");
        List<Food> nonVegMenu = new ArrayList<>();
        nonVegMenu.add(nonVegItem1);
        nonVegMenu.add(nonVegItem2);

        // create the view object
        MenuView menuView = new MenuView();

        // create the controller object
        RestaurantController restaurantController = new RestaurantController(menuView, vegMenu, nonVegMenu);

        // display the menus using the controller
        restaurantController.displayVegMenu();
        restaurantController.displayNonVegMenu();
    }
}