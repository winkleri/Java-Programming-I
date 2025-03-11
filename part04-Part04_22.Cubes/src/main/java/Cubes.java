
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
                
        while(true) {
            String row = scanner.nextLine();
            if(row.equals("end")) {
                break;
            }
            input = Integer.valueOf(row);
            input = input * input * input;
            
            System.out.println(input);
        }
        
    }
}
