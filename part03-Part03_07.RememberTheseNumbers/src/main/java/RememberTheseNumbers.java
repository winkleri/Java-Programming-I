
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }

            numbers.add(luku);
        }
        
        int index = numbers.size() - 1;
        int counter = 0;
        
        while(counter <= index) {
            if(numbers.get(counter) != -1) {
             System.out.println(numbers.get(counter));
            }
            counter++;
            
        }
        
    }
}
