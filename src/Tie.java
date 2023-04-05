public class Tie extends Clothing implements IMaleClothes {
    Tie(String color, Clothes size, int price) {
        super(color, size, price);
    }
    Tie(){}

    @Override
    public String toString() {
        return "Tie["+ "size is "+getSize()+", price is "+getPrice()+", color is "+getColor()+"]";
    }

}
