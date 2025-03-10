class Person{
    String name;
    int age;
    String gender;
    
    // default constructor use 
    // define the constructor 
    Person(){
        name = "Shivam";
        age = 24;
        gender = "Male";
    }

    void display(){
        System.out.println("Name: "+ name+ " Age: "+age+" Gender: "+ gender);
    }
}

public class Constructors1 {
    public static void main(String[] args){
        Person obj = new Person();
        obj.display();
    }    
}
