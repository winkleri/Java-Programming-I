/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Ilja
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("stop")) break;
            switch(input) {
                case "add" : handleAdd();
                break;
                case "list" : handleList();
                break;
                case "remove" : handleRemoved(); 
                default : System.out.println("Unknown command");
            }
            
            
        }
    }
    
    public void handleAdd() {
        System.out.println("To add:");
        String input = scanner.nextLine();
        list.add(input);
    }
    
    public void handleList() {
        list.print();
    }
    
    public void handleRemoved() {
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        list.remove(number);
    }
}
