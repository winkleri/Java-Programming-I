
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        if(!meals.contains(meal))
        this.meals.add(meal);
    }
    
    public void printMeals() {
        for(String items : meals) {
            System.out.println(items);
        }    
    }
    
    public void clearMenu() {
       meals.clear();
    }
}
