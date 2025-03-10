class Vehicle{
  String brand;
    public Vehicle(String brand) {
      this.brand = brand;
   }
  void start(){
   System.out.println(brand +" is Starting....");
  }
}

class Car extends Vehicle{

   public Car(String brand){
      super(brand);
   }

   void drive(){
      System.out.println(brand +" is Driving...");
   }
}

public class Main{
   public static void main(String[] args){
    // main method
    Car ca = new Car("BMW");
    ca.start();
    ca.drive();
    }
}