
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOfOldest = "";
        
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
                    nameOfOldest = people[0];
                }
                
            } 
        }
        System.out.println("Name of the oldest:" + nameOfOldest);
    }
}
