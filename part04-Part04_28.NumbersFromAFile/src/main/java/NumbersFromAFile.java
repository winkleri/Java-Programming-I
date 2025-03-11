
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        
        ArrayList<Integer> list = new ArrayList<>();
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                list.add(Integer.valueOf(reader.nextLine()));
            }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        
        // für jeden eintrag der liste
        for(int number : list) {
            // wird geschaut ob die laufvariable enthalten ist
            if(list.contains(number)) {
                //wenn die laufvariable enthalten ist muss sie sich auch in der range befinden
                if(number <= upperBound && number >= lowerBound) {
                    //menge der zahlen in reichweite wird gezählt
                    count++;
                }
            }
        }
        
        /* Beides möglich aber for each schöner zum durchlaufen der liste
        for(int i = lowerBound; i <= upperBound; i++) {
            if(list.contains(i)) {
                count++;
            }
        } */
        
        System.out.println("Numbers: " + count);
    }

}
