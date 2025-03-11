
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        double average = 0.0;
        if(this.count != 0) {
            average = (this.sum * 1.0) / this.count;
        }
        return average;
    }
    
    
    public String toString() {
        return "The current Statistical value is: " + this.count + "the other two values are: " + this.sum + ", " + this.average();
    }
}
