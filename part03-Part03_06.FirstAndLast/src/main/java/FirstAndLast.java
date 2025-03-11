
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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
        int counter = 0;
        int index = list.size() - 1;
        while(counter <= index) {
            if(counter == 0 || counter == index) {
            System.out.println(list.get(counter));
            } 
            counter++;
        }
    }
}
