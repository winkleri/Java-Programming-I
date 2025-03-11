
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        for(int index = list.size() - 1; 0 <= index; index--) {
            if (index == list.size() - 2) {
                break;
            }
            System.out.println(list.get(index));
            
            
        }
       
           
    }
}
