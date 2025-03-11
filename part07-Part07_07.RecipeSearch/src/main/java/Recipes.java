/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.text.MessageFormat;
/**
 *
 * @author Ilja
 */
public class Recipes {
    private String name;
    private int cookTime;
    private List<String> ingredients;
    
    public Recipes(String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public Recipes setName(String name) {
        this.name = name;
        return this;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    
    public Recipes setCookTime(int cookTime) {
        this.cookTime = cookTime;
        return this;
    }
    
    public List<String> getIngredients() {
        return ingredients;
    }
    
    public Recipes setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }
    
    @Override
    public String toString() {
        return MessageFormat.format("{0}, cooking time: {1}", name, cookTime);
    }
    
}
