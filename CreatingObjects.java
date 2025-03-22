class Person{
    public String name;
    public int age;

    public void infoSett(){
        System.out.println(name +" and your age is "+age);
    }
}

public class CreatingObjects{
    public static void main(String[] args) {
        // Main Method
        Person[] per = new Person[3];
        for(int j = 0;j<per.length; j++){
            per[j] = new Person();
        }
        per[0].name = "God";
        per[0].age = 24;
        
        per[1].name = "Shivam";
        per[1].age = 20;

        per[2].name = "Shivans";
        per[2].age = 18;

        for(Person person : per){
            person.infoSett();
        }

    }
}