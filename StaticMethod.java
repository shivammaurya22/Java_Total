class Mobile{
    String name;
    int price;
    String model;

    public void display(){
        System.out.println(name+" : "+model+" : "+price);
    }
    public static void display1(Mobile mob1){
        System.out.println(mob1.name+" : "+mob1.model+" : "+mob1.price);
    }
}


public class StaticMethod {
    public static void main(String[] args) {
        Mobile mob = new Mobile();
        Mobile mob1 = new Mobile();
        mob.name = "Vivo Reno 12";
        mob.price = 22000;
        mob.model = "Vivo";

        mob1.name = "Redmi y2";
        mob1.price = 12000;
        mob1.model = "Redmi";

        mob.display();
        Mobile.display1(mob1);
    }
}
