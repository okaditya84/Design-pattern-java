public class VegMenu {
    private static VegMenu instance;

    private VegMenu() {
        // private constructor to prevent instantiation outside the class
    }

    public static VegMenu getInstance() {
        if (instance == null) {
            instance = new VegMenu();
        }
        return instance;
    }

    public void displayMenu() {
        System.out.println("-------VEG MENU--------");
        System.out.println("1. Veg Item 1");
        System.out.println("2. Veg Item 2");
        System.out.println("-----------------------");
    }
}
