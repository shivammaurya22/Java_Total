class Mobile{
    static String name;  // Here is the example of Static keyword.
    int price;
    String model;

    public void display(){
        System.out.println(name+" : "+model+" : "+ price);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        // Main Method
        Mobile mob1 = new Mobile();
        Mobile.name = "Vivo Y20A";
    //  mob1.name = "Vivo Y20A";
        mob1.model = "Vivo";
        mob1.price = 12000;
        
        Mobile mob2 = new Mobile();
        Mobile.name = "Vivo Y20A";
    //  mob2.name = "Redmi note 14";
        mob2.price = 15000;
        mob2.model = "Redmi";

        // It will change the all the object. name set to all objects.
        Mobile.name = "Oppo";
    //  mob1.name = "Oppo";
        mob2.display();
        mob1.display();
    }
}
