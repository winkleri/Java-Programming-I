/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilja
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand second;
    
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredths.advance();
        
        if (this.hundredths.value() == 0) {
            this.second.advance();
        }      
    }
    
    @Override
    public String toString() {
        return this.second + ":" + this.hundredths;
    }
    
}
