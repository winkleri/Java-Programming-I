/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
 import java.util.ArrayList;
/**
 *
 * @author Ilja
 */
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        jokes.add(joke);   
    }
    
    public String drawJoke() {
        if (jokes.isEmpty()) {
           return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }   
    }
    
    public void printJokes() {
    System.out.println("Printing the jokes.");
        for (String joke : jokes) {
            System.out.println(joke);
    }
    }   
 }