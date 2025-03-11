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
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            switch(input) {
                case "add": handleAdd();
                break;
                case "search" : handleSearch();
                break;
                default : System.out.println("Unknown command");
            }      
        }   
            
    }
    
    public void handleAdd() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("To be translated:");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void handleSearch() {
        System.out.println("To be searched:");
        String word = scanner.nextLine();
        String translation = this.dictionary.translate(word);
        if(translation == null) { 
            System.out.println("Word " + word + " was not found"); 
        } else System.out.println("Translation: " + translation);
    }    
}
