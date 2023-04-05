public class Trousers extends Clothing implements IMaleClothes, IFemaleClothes {
    Trousers(){}
    Trousers(String color, Clothes size, int price) {
        super(color, size, price);
    }
    @Override
    public String toString() {
        return "Trousers["+ "size is "+getSize()+", price is "+getPrice()+", color is "+getColor()+"]";
    }

}
