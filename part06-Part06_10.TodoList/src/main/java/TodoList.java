/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Ilja
 */
public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList() {
    
    }
    
    public void add(String task) { 
        this.list.add(task);
    }
    
    public void print() {
        for(String entries : list) {
            int index = this.list.indexOf(entries) + 1;
            System.out.println(index + ": " + entries);
        }
    }
    
    public void remove(int number) {
        number--;
        this.list.remove(number);
    }
}   

