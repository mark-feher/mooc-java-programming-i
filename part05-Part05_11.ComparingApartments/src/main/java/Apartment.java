
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = 0;
        int price = 0;
        int comparedPrice = 0;

        price = this.princePerSquare * this.squares;
        comparedPrice = compared.princePerSquare * compared.squares;
        difference = price - comparedPrice;

        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compare) {
        boolean isMoreExpensive = false;
        int price = 0;
        int comparedPrice = 0;

        price = this.princePerSquare * this.squares;
        comparedPrice = compare.princePerSquare * compare.squares;

        if (price > comparedPrice) {
            isMoreExpensive = true;
        }

        return isMoreExpensive;
    }
}
