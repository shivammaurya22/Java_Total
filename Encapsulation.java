class Person{
   private String name;
   private int age;
   private String gender;
    
    // Parameterized constructor use 
    // define the constructor 
    Person(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }
    
    // getter method to access these variables
    public String getdetails(){
        return "Name: "+name+" Age: "+age+" Gender: "+ gender;
    }

   public void setDetails(String name, int age, String gender){
    if(age > 0){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }else{
        System.out.println("Invalid Age.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Person obj = new Person("Shivam",24,"Male");
        System.out.println("Details: "+obj.getdetails());
        obj.setDetails("Ravi", 20, "Male");
        System.out.println("Updated Details: "+obj.getdetails());
    }    
}
