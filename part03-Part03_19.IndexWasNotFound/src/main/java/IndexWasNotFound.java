

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        
        // Implement the search functionality here
        int index = 0;
        boolean finished = false;
        while(index < array.length) {
            if(searching == array[index]) {
                finished = true;
                break;
            } else {
                finished = false;
            }
            index++;
        }
        if (finished) {
            System.out.println(searching + " is at index " + index + ".");
        } else {
            System.out.println(searching + " was not found.");
        }
    }
}
