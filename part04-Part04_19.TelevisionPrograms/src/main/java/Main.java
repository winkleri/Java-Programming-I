import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int duration = 0;
        
        
        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
                duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram tvProgram = new TelevisionProgram(name, duration);
            programs.add(tvProgram);
            
            
        }
        System.out.println("Program's maximum duration?");
        int value = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram candidate : programs) {
            if(candidate.getDuration() <= value) {
                System.out.println(candidate);
            } 
        }
    }
}
