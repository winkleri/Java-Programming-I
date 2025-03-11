
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int sum = 0;
        int counter = 0;
        String name = "";
        
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] people = input.split(",");
            
            int age = Integer.valueOf(people[1]);
            counter++;
            sum += age;
            average = (1.0 * sum / counter);

            String compare = people[0];
            
            
            for(int i = 0; i<people.length; i++) {
                if(name.length() < compare.length()) {
                    name = compare;
                }
            }
 
            
              
           
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + average);
    }
}
