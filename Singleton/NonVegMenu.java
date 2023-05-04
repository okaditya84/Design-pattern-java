public class NonVegMenu {
    private static NonVegMenu instance;

    private NonVegMenu() {
        // private constructor to prevent instantiation outside the class
    }

    public static NonVegMenu getInstance() {
        if (instance == null) {
            instance = new NonVegMenu();
        }
        return instance;
    }

    public void displayMenu() {
        System.out.println("-----NON-VEG MENU------");
        System.out.println("1. Non-Veg Item 1");
        System.out.println("2. Non-Veg Item 2");
        System.out.println("-----------------------");
    }
}
