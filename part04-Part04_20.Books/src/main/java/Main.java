import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();
        for(Book candidate : books) {
            if(information.contains("everything")) {
                System.out.println(candidate.getTitle() + ", " + candidate.getPages() + " pages" + ", " + candidate.getYear());
            } else if(information.contains("name")) {
                System.out.println(candidate.getTitle());
            } else if(information.contains("year")) {
                System.out.println(candidate.getYear());
            } else if(information.contains("pages")) {
                System.out.println(candidate.getPages() + " pages");
            } else {
                break;
            }
            
         }
        
    }
}
