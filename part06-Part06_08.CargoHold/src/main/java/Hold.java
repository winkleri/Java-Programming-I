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
public class Hold {
    private ArrayList<Suitcase> list = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + this.holdWeight() > maxWeight) return;
        if(suitcase.totalWeight() + this.holdWeight() <= maxWeight) list.add(suitcase);
    }
    
    public int holdWeight() {
        int holdWeight = 0;
        for(Suitcase candidates : list) {
            holdWeight += candidates.totalWeight();
        }
        return holdWeight;
    }
    
   public void printItems() {
       for(Suitcase entries : list) {
           entries.printItems();
       }
   }
    
    @Override
    public String toString() {
        return list.size() + " suitcases (" + this.holdWeight() + " kg)";
    }
}
