
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First: " + firstVolume + "/" + maxVolume);
            System.out.println("Second: " + secondVolume + "/" + maxVolume);
            

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;             
            }
            
            String[] array = input.split(" ");
            String instruction = array[0];
            int amount = Integer.valueOf(array[1]);
            
            
            switch(instruction) {
                case "add" :  
                    if(amount > 0 && amount + firstVolume < 100) {
                        firstVolume += amount;
                    } else if(amount + firstVolume > 100) {
                        firstVolume = 100;
                    }
                    break;
                case "move" :
                    if(firstVolume >= amount && firstVolume + secondVolume <= 100 && amount > 0) {
                        firstVolume -= amount;
                        secondVolume += amount;
                    } else if (amount + secondVolume > 100 ) {
                        secondVolume = 100;
                    } else if (amount > firstVolume) {
                        secondVolume = firstVolume;
                    }
                    break;
                case "remove" :
                    if(secondVolume > 0 && secondVolume - amount > 0 && amount > 0) {
                        secondVolume -= amount; 
                    } else if (secondVolume - amount < 0 ) {
                        secondVolume = 0;
                    }
                    break;
            
                
                
            }

        }
    }

}
