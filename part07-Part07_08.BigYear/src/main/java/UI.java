/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Ilja
 */
public class UI {
    private Scanner sc;
    private ArrayList<Bird> database;
    
    
    public UI(Scanner sc, ArrayList<Bird> database) {
        this.sc = sc;
        this.database = database;
    }
    
    public void start() {
        while(true) {
            System.out.println("?");
            final String input = sc.nextLine();
            
            if(input.equalsIgnoreCase("Quit")) {
                break;
            }
            
            if(input.equalsIgnoreCase("Add")) {
                System.out.println("Name:");
                final String nameInput = sc.nextLine();
                System.out.println("Name in Latin:");
                final String latinInput = sc.nextLine();
                add(nameInput, latinInput);
            }
            
            if(input.equalsIgnoreCase("Observation")) {
                System.out.println("Bird?");
                final String name = sc.nextLine();
                observe(name);
            }
            
            if(input.equalsIgnoreCase("One")) {
                System.out.println("Bird?");
                final String name = sc.nextLine();
                one(name);
            }
            
            if(input.equalsIgnoreCase("All")) {
                all();
            }
        }
    }
    
    public void add(String nameInput, String latinInput) {     
        Bird bird = new Bird(nameInput, latinInput);
        database.add(bird);
    }
    
    public void observe(String name) {
        
        for(Bird bird : database) {
            if(bird.getName().equals(name)) {
                bird.addObservation();
                return;            
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void one(String name) {
        for(Bird bird : database) {
            if(bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        
        System.out.println("Not a bird!");
    }
    
    public void all() {
        for(Bird bird : database) {
            System.out.println(bird);
        }
    }
}
