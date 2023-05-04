import java.util.ArrayList;
import java.util.List;

// Originator class
class MealPlan {
    private String meal;

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }

    public MealPlanMemento saveToMemento() {
        return new MealPlanMemento(meal);
    }

    public void restoreFromMemento(MealPlanMemento memento) {
        meal = memento.getSavedMeal();
    }
}

// Memento class
class MealPlanMemento {
    private final String meal;

    public MealPlanMemento(String meal) {
        this.meal = meal;
    }

    public String getSavedMeal() {
        return meal;
    }
}

// Caretaker class
class MealPlanCaretaker {
    private final List<MealPlanMemento> mementoList = new ArrayList<>();

    public void addMemento(MealPlanMemento state) {
        mementoList.add(state);
    }

    public MealPlanMemento getMemento(int index) {
        return mementoList.get(index);
    }
}

// Driver code
public class RestaurantMealPlan {
    public static void main(String[] args) {
        MealPlan mealPlan = new MealPlan();
        MealPlanCaretaker caretaker = new MealPlanCaretaker();

        mealPlan.setMeal("Chicken Alfredo");
        caretaker.addMemento(mealPlan.saveToMemento());

        mealPlan.setMeal("Steak and Potatoes");
        caretaker.addMemento(mealPlan.saveToMemento());

        mealPlan.setMeal("Fish and Chips");
        caretaker.addMemento(mealPlan.saveToMemento());

        mealPlan.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Meal plan restored to: " + mealPlan.getMeal());
    }
}
