
import java.util.ArrayList;


public class ListArr2D {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> Allitems = new ArrayList<>();
        
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Halwa");
        foods.add("kheer");
        foods.add("Sabji");

        ArrayList<String> names = new ArrayList<>();
        names.add("Shivam");
        names.add("Shubham");
        names.add("Shivans");

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Lamborgini");
        cars.add("Tata");
    
    Allitems.add(foods);
    Allitems.add(names);
    Allitems.add(cars);    
    System.out.println("Allitems:"+Allitems.get(0).get(0));
    }
}
