
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int input = 0;
        double avg = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0) {
                break;
            }
            
            if(number < 0 || number > 0) {
                input++;
                sum += number;
                avg = sum / input;
                
                
            }
            
            
        }
        System.out.println("Average of the numbers: " + avg);    
        
    }
}
