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
public class Suitcase {
    private ArrayList<Item> list = new ArrayList<>();
    private int maxWeight; 
     
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(item.equals(null)) return;
        if(item.getWeight() < 0) return;
        for(Item sum : list) {
            if(item.getWeight() + this.totalWeight() > this.maxWeight) return;
        }
        list.add(item);
    }
      
    
    public void printItems() {
        for(Item candidate : list) {
            System.out.println(candidate);
        }
    }
    
    public int totalWeight() {
        if(list.isEmpty()) return 0;
        int weight = 0;
        for(Item candidate : list) {
            weight += candidate.getWeight();
            if(weight < 0) return 0;
        }
        return weight;
    }   
    
    public Item heaviestItem() {
        if(this.list.isEmpty()) return null;
        Item heaviest = list.get(0);
        for(Item candidate : list) {
            if(candidate.getWeight() > heaviest.getWeight()) heaviest = candidate;
        }
        return heaviest;
    }
    
    @Override
    public String toString() {
        if(list.size() == 0) return "no items (0 kg)";
        if(list.size() == 1) return "1 item (" + this.totalWeight() + " kg)";
        
        return list.size() + " items (" + this.totalWeight() + " kg)";
    }
}
