
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] people = input.split(",");
            
            for(int i = 0; i<people.length; i++) {
                System.out.println(people[1]);
                int age = Integer.valueOf(people[1]);
                if(oldest < age ) {
                    oldest = age;
                    
                }
            } 
        }
        System.out.println("Age of the oldest:" + oldest);
    }
}
