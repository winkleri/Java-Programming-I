
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String word = scanner.nextLine();
            if(word.equals("")) {
                break;
            }
            String[] message = word.split(" ");
            System.out.println(message[0]);
        }

    }
}
