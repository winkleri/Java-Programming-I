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
public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private GradeRegister register = new GradeRegister();
    
    public UserInterface(Scanner scanner, GradeRegister register) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            int value = Integer.parseInt(scanner.nextLine());
            if(value == -1) break;
            if(value >= 0 && value <= 100) register.add(value);
        }
        this.printAverageAll();
        this.printAveragePassing();
        this.printPassPercentage();
        this.printGradeDistribution();
             
        }
    
    public void printAverageAll () {
        if(register.pointAverage() == 0) System.out.println("Point average (all): -");
        System.out.println("Point average (all): " + register.pointAverage());
    }
    
    public void printAveragePassing () {
        if(register.averagePassing() == 0) System.out.println("Point average (passing): -");
        System.out.println("Point average (passing): " + register.averagePassing());
        
    }
    
    public void printPassPercentage() {
        if(register.passPercentage() == 0) System.out.println("Pass percentage: -");
        System.out.println("Pass percentage: " + register.passPercentage());
    }
    
    public void printGradeDistribution() {
    System.out.println("Grade distribution:");
        String[] stars = register.getStars();
        System.out.println("5: " + stars[5]);
        System.out.println("4: " + stars[4]);
        System.out.println("3: " + stars[3]);
        System.out.println("2: " + stars[2]);
        System.out.println("1: " + stars[1]);
        System.out.println("0: " + stars[0]);
    
    }
            
}
