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
public class Stack {
    ArrayList<String> list = new ArrayList<>();
    
    public boolean isEmpty() {
        return list.size() == 0;
    }
    
    public void add(String value) {
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        int toRemove = this.list.size() -1;
        return list.remove(toRemove);
        
    }
}
