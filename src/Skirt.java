public class Skirt extends Clothing implements IFemaleClothes {
    Skirt(){}
    Skirt(String color, Clothes size, int price) {
        super(color, size, price);
    }

    @Override
    public String toString() {
        return "Skirt["+ "size is "+getSize()+", price is "+getPrice()+", color is "+getColor()+"]";
    }

}
