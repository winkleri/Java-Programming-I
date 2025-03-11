
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int value = Integer.valueOf(scanner.nextLine());
        int lastIndex = list.size() - 1;
        int index = list.get(0);
        for(int i = 0; i<=lastIndex; i++) {
            if(value == list.get(i)) {
                index = i;
                System.out.println(value + " is at index " + index);
            }
            
        }
        
    }
}
