abstract class Clothing {
    String color;
    Clothes size;
    int price;
    Clothing(){}

    Clothing(String color, Clothes size, int price){
        this.color=color;
        this.size=size;
        this.price=price;
    }

    public Clothes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

}
