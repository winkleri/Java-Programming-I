
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> namesAndIdentifiers = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            
            if(namesAndIdentifiers.isEmpty()) {
                namesAndIdentifiers.add(new Archive(identifier, name));
            }
            
            boolean idDoesntExist = true;
            // boolean nameDoesntExist = true;
            for(Archive item : namesAndIdentifiers) {
                if(item.equals(new Archive(identifier, name))) {
                   // nameDoesntExist = false;
                    idDoesntExist = false;
                }         
            }
            if(idDoesntExist) {
                namesAndIdentifiers.add(new Archive(identifier, name));
            } 
            
                  
        }
        System.out.println("==Items==");
        for(Archive archive : namesAndIdentifiers) {
            System.out.println(archive);
        }
        
        
        
    }
}
