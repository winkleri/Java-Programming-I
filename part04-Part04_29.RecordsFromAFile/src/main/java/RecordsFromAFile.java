
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file?");
        String file = scanner.nextLine();
        
        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                
                String[] info = line.split(",");
                String name = info[0];
                int age = Integer.valueOf(info[1]);
                
                
                System.out.println(name + ", " + "age: " + age + " years");
                
            }
            
        } catch(Exception e) {
            System.out.println("Ha! I caught it. Now stop putting in wrong file names!");
        }
    }
}
