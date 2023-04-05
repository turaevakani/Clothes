public class Atelier {
    public void dressFemale(Clothing[] clothes){
        System.out.println("Female clothes:");
        for(Clothing c:clothes){
            if(c instanceof IFemaleClothes){
                System.out.println(c);
            }
        }
    }

    public void dressMale(Clothing[] clothes){
        System.out.println("Male clothes:");
        for(Clothing c:clothes){
            if(c instanceof IMaleClothes){
                System.out.println(c);
            }
        }
    }

}
