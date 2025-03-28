class Human{
    private String name;
    private int age;
    
    // try Setter to explain this keyword works
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: "+ this.name + ", and Age is just "+ this.age);
        
    }
}

public class ThisKeyword {
   public static void main(String[] args) {
       Human obj = new Human("Shivam",24);
       obj.display();
   }   
}
