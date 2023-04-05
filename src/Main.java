import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Clothing[] clothes = {
                new TShirt("blue", Clothes.L, 23),
                new Trousers("grey",Clothes.XXS, 34),
                new Tie("black",Clothes.S, 24),
                new Skirt("red",Clothes.M, 42),
                new Skirt("green",Clothes.XS, 40),
        };
        Atelier atelier=new Atelier();
//        System.out.println(Arrays.toString(clothes));
        atelier.dressFemale(clothes);
        System.out.println("----------------------------------");
        atelier.dressMale(clothes);
//        Skirt sk=new Skirt();
//        sk.dressFemale();
    }
}
