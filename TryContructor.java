class Person{
    private int age;

    Person(int age){
        this.age = age;
    }

    void canEat(){
        System.out.println("The person Can eat something. and age is "+ this.age);
    }
}
public class TryContructor{
    public static void main(String[] args) {
        Person pe = new Person(24);
        pe.canEat();
    }
}