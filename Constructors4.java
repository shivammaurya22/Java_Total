class Car{
    String name;
    Car(String name){
        this.name = name;
    }
}

class Garege{
    void parking(Car car){
        System.out.println("The "+ car.name +" is parked in the garege.");
    }
}

public class Constructors4{
    public static void main(String[] args){
        Garege gar = new Garege();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Lambo");
        gar.parking(car1);
        gar.parking(car2);
    }
}