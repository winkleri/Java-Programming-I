
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Objects;
import java.nio.file.Paths;

public class RecipeSearch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        final String file = scanner.nextLine();
        final List<Recipes> recipes  = readRecipesFromFile(file);
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipe by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("Enter command: ");
            final String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("stop")) break;
                        
            if(input.equalsIgnoreCase("list")) {
                for(Recipes recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            
            if(input.equalsIgnoreCase("find cooking time")) {
                System.out.println("Max cooking time: ");
                final int query = Integer.parseInt(scanner.nextLine());
                for(Recipes recipe : recipes) {
                    if(recipe.getCookTime() <= query) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if(input.equalsIgnoreCase("find name")) {
                System.out.println("Searched word: ");
                final String query = scanner.nextLine();
                for(Recipes recipe : recipes) {
                    if(recipe.getName().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if(input.equalsIgnoreCase("find ingredient")) {
                System.out.println("Ingredient: ");
                final String query = scanner.nextLine();
                for(Recipes recipe : recipes) {
                    for(String ingredient : recipe.getIngredients()) {
                        if(Objects.equals(ingredient, query)) {
                        System.out.println(recipe);
                        }
                    }
                }
            }
        }       
    }
    
    public static List<Recipes> readRecipesFromFile(String file) {
        final List<Recipes> recipes = new ArrayList<>();
        final List<String> recipeParts = new ArrayList<>();
        
        try(Scanner sc = new Scanner(Paths.get(file))) {
            
            while(sc.hasNextLine()) {
                final String line = sc.nextLine();
                if(!line.isEmpty()) {
                    recipeParts.add(line);
                } else {
                    assignRecipeParts(recipes, recipeParts);
                }
            }
            if(!recipeParts.isEmpty()) {
                assignRecipeParts(recipes, recipeParts);
            }
        } catch (Exception e) {
            System.out.println("Error while reading file: " + e.getMessage());
        }
        
        return recipes;
      
                             
    }
    
    private static void assignRecipeParts(List<Recipes> recipes, List<String> recipeParts) {
    String recipeName;
    int cookTime;
    recipeName = recipeParts.get(0);
    cookTime = Integer.parseInt(recipeParts.get(1));
    recipeParts.remove(0);
    recipeParts.remove(0);
    recipes.add(new Recipes(recipeName, cookTime, new ArrayList<>(recipeParts)));
    recipeParts.clear();    
        
    }
}

