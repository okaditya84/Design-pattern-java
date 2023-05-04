import java.util.List;

public class RestaurantController {
    private MenuView menuView;
    private List<Food> vegMenu;
    private List<Food> nonVegMenu;

    public RestaurantController(MenuView menuView, List<Food> vegMenu, List<Food> nonVegMenu) {
        this.menuView = menuView;
        this.vegMenu = vegMenu;
        this.nonVegMenu = nonVegMenu;
    }

    public void displayVegMenu() {
        menuView.displayMenu("Veg", vegMenu);
    }

    public void displayNonVegMenu() {
        menuView.displayMenu("Non-Veg", nonVegMenu);
    }
}