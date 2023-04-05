public class TShirt extends Clothing implements IMaleClothes, IFemaleClothes {
    TShirt(String color, Clothes size, int price) {
        super(color, size, price);
    }
    TShirt(){}

    @Override
    public String toString() {
        return "T-Shirt["+ "size is "+getSize()+", price is "+getPrice()+", color is "+getColor()+"]";
    }
//    @Override
//    public void dressFemale() {
//        System.out.println("dressing a female");
//    }
//
//    @Override
//    public void dressMale() {
//        System.out.println("dressing a male");
//
//    }
}
