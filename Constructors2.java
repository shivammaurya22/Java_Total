class Person{
    String name;
    int age;
    String gender;
    
    // Parameterized constructor use 
    // define the constructor 
    Person(String n, int a, String g){
        name = n;
        age = a;
        gender = g;
    }

    void display(){
        System.out.println("Name: "+ name+ " Age: "+age+" Gender: "+ gender);
    }
}

public class Constructors2 {
    public static void main(String[] args){
        Person obj = new Person("Shivam",24,"Male");
        obj.display();
    }    
}
