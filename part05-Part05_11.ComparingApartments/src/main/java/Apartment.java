
public class Apartment {

    
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
       
    public int priceDifference(Apartment compared) {
        int priceDifference = (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        if(priceDifference < 0) {
            return priceDifference * -1;
        } else {
        return (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.pricePerSquare > compared.pricePerSquare) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
