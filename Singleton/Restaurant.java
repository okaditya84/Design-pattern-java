public class Restaurant {
    public static void main(String[] args) {
        VegMenu vegMenu = VegMenu.getInstance();
        NonVegMenu nonVegMenu = NonVegMenu.getInstance();

        // display the menus
        vegMenu.displayMenu();
        nonVegMenu.displayMenu();

        // test if the instances are the same
        System.out.println("vegMenu == vegMenu: " + (vegMenu == vegMenu));
        System.out.println("nonVegMenu == nonVegMenu: " + (nonVegMenu == nonVegMenu));
    }
}
