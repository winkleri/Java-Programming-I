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
public class GradeRegister {
    private ArrayList<Integer> points;
    private double averageAll;
    private double averagePassing;
    private double percentage;
    private String[] stars;
    
    public GradeRegister() {
        points = new ArrayList<>();
        averageAll = 0;
        averagePassing = 0;
        percentage = 0;
        stars = new String[6];
    }
    
    public double getAverageAll() {
        return this.averageAll;
    }
    
    public double getAveragePassing() {
        return this.averagePassing;
    }
    
    public double pointAverage() {
        int sum = 0;
        for(int point : this.points) {
           sum += point;
        }
        
        return this.averageAll = sum / points.size();
    }
    
    
    public double averagePassing() {
        int sum = 0;
        int counter = 0;
        for(int point : this.points) {
            if(point >= 50 && point <= 100) {
                sum+= point;
                counter++;
            }
        }
        return this.averagePassing = sum / counter;
    }
    
    public void add(int value) {
        this.points.add(value);
    }
    
    
    
    public void gradeDistribution() {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for(int point : this.points) {
            if(0 <= point && point < 50) zero++;
            if(49 < point && point < 60) one++;
            if(59 < point && point < 70) two++;
            if(69 < point && point < 80) three++;
            if(79 < point && point < 90) four++;
            if(89 < point && point < 100) five++;
        }
        
        
        for(int i = 0; i<stars.length; i++) {
            String result = "*".repeat(zero);
            stars[0] = result;
            String result1 = "*".repeat(one);
            stars[1] = result1;
            String result2 = "*".repeat(two);
            stars[2] = result2;
            String result3 = "*".repeat(three);
            stars[3] = result3;
            String result4 = "*".repeat(four);
            stars[4] = result4;
            String result5 = "*".repeat(five);
            stars[5] = result5;
        }
        
    }
    
    public String[] getStars() {
        this.gradeDistribution();
        return this.stars;
    }
    
    public double passPercentage() {
        double passing = 0;
        double participants = 0;
        for(int score : this.points) {
            if(score >= 50) {
                passing++;
            }
            participants++;
        }
        this.percentage = 100 * passing / participants; 
        return percentage;
    }
    
    
    
}
