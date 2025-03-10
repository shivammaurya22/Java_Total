
import java.util.ArrayList;


public class ListArr {
    public static void main(String[] args){
        // ArrayList 
     ArrayList<String> names = new ArrayList<>();
        names.add("Shivam");
        names.add("Shubham");
        names.add("Satyam");
        for(int i = 0; i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
