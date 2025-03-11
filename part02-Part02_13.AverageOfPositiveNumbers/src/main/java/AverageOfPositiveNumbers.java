
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = 0;
        int sum = 0;
        
        while(true) {
            System.out.println("Give an input:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(input == 0 && number <= 0) {
                System.out.println("Cannot calculate average");
            }
            
            if(number == 0) {
                break;
            }
            
            if(number > 0 && input >= 0) {
                input++;
                sum += number;
            }
            
        }
        double avg = (sum * 1.0) / input;
        System.out.println("Average of the positive numbers: " + avg);
    }
}
