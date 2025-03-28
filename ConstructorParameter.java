class Human{
    private String name;
    private int age;

    Human(String n, int a){
        this.name = n;
        this.age = a;
    }
    void display(){
        System.out.println(this.name +" : "+ this.age);
    }
}

public class ConstructorParameter {
   public static void main(String[] args) {
       Human obj = new Human("Shivam", 24);
      obj.display();
   }  
}
