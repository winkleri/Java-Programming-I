
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        list.add("code alot");
        list.add("pray to God for mercy");
        list.add("train hard");
        list.add("go to Thailand");
        list.print();
        list.remove(1);
        list.print();
       
        //UserInterface ui = new UserInterface(list, scanner);
        //ui.start();

    }
}
