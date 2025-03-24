class Human{
    private String name;
    private int age;

    // create method to access the variables. if its private.
    public int displayAge(){
        return age;
    }
    public String displayName(){
        return name;
    }

    public void setInfo(int a, String n){
        age = a;
        name = n;
    }
}

public class EncapsulationD1 {
    public static void main(String[] args) {
        Human man = new Human();
      //  man.name = "GoD";
     //   man.age = 20;
        man.setInfo(20, "Shivans");
        System.out.println("Your name is "+man.displayName()+" and age is "+ man.displayAge());
    }
}
