
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;             
            }
            
            String[] array = input.split(" ");
            String instruction = array[0];
            int amount = Integer.valueOf(array[1]);
            
            
            switch(instruction) {
                case "add" : 
                    first.add(amount);
                    break;
                case "move" :
                    if(first.contains() < amount) {
                        second.add(first.contains());
                        first.remove(first.contains());
                    } else {
                        first.remove(amount);
                        second.add(amount);
                    }
                    break;
                case "remove" :
                    second.remove(amount);
                    break;
            
                
                
            }

        }
    }

}
