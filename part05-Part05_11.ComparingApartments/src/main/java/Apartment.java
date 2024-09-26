
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        //Checks to see which what is larger in squares
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int apartment1 = this.princePerSquare * this.squares;
        int apartment2 = compared.princePerSquare * compared.squares;
       // Math.abs returns the absolute value. No need to make the logic for it.
        return Math.abs(apartment1 - apartment2);
    }
    public boolean moreExpensiveThan(Apartment compared){
        //Compares the apartments to see which one is more expensive
        int apartment1 = this.princePerSquare * this.squares;
        int apartment2 = compared.princePerSquare * compared.squares;
        if(apartment1 > apartment2){
            return true;
        }
        return false;
    }

}
