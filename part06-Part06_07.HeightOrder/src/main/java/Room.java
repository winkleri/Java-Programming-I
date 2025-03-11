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
public class Room {
    private ArrayList<Person> list = new ArrayList<>();
    
    public Room() {
    
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.size() == 0;
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if(this.isEmpty()) return null;
        Person shortest = this.list.get(0);
        for(Person candidate : list) {
            if(candidate.getHeight() < shortest.getHeight()) shortest = candidate;
        }
        return shortest;
    }
    
    public Person take() {
        if(this.isEmpty()) return null;
        Person removed = (this.shortest());
        list.remove(removed);
        return removed;
    }
}
