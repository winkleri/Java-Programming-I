
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item deezNuts = new Item("hahagoteem", 1000);
        Item notAdded = new Item("test", 4000);
        System.out.println(deezNuts);
        
        Suitcase suitcase = new Suitcase(3000);
        suitcase.addItem(deezNuts);
        suitcase.addItem(notAdded);
        System.out.println(suitcase);
        System.out.println(suitcase.totalWeight());
        Hold hold = new Hold(10000);
        hold.addSuitcase(suitcase);
        System.out.println(deezNuts);
        suitcase.printItems();
        hold.printItems();
        
    
    }

}
