class Human{
    private String name = "Shivam";
    private int age = 20;

    // display a getter method to access the variable
    public String getName(){
        return "Name is "+ name;
    }

    // get age using another method
    public int getAge(){
        return age;
    }

    // setter to exchange the variable name. 
    public String setName(String n){
        name = n;
        return "Name update "+name;
    }
    // set age to change the age;
    public int setAge(int a){
        age = a;
        return age;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Human man = new Human();
        System.out.println(man.getName());
        System.out.println(man.setName("Shivans"));
        System.out.println(man.getAge());
        System.out.println(man.setAge(24));
    }
}