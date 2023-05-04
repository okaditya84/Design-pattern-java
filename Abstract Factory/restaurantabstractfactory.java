// Abstract factory interface
//
interface MealFactory {
    Meal createMeal();
}

// Concrete factory for vegetarian meals
class VegMealFactory implements MealFactory {
    public Meal createMeal() {
        Meal meal = new Meal();
        meal.addItem(new MenuItem("Fries", "Crispy french fries with a side of ketchup", 2.99, true));
        meal.addItem(new MenuItem("Drink", "Refreshing soda in your choice of flavor", 1.99, true));
        return meal;
    }
}

// Concrete factory for non-vegetarian meals
class NonVegMealFactory implements MealFactory {
    public Meal createMeal() {
        Meal meal = new Meal();
        meal.addItem(new MenuItem("Burger", "Juicy beef patty with melted cheese and bacon", 9.99, false));
        meal.addItem(new MenuItem("Fries", "Crispy french fries with a side of ketchup", 2.99, true));
        meal.addItem(new MenuItem("Drink", "Refreshing soda in your choice of flavor", 1.99, true));
        return meal;
    }
}

// Example usage
public class restaurantabstractfactory {
    public static void main(String[] args) {
        // Create a vegetarian meal
        MealFactory vegMealFactory = new VegMealFactory();
        Meal vegMeal = vegMealFactory.createMeal();
        vegMeal.printMenu();

        // Create a non-vegetarian meal
        MealFactory nonVegMealFactory = new NonVegMealFactory();
        Meal nonVegMeal = nonVegMealFactory.createMeal();
        nonVegMeal.printMenu();
    }
}
