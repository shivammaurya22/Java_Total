opublic class Person{
    public static void main(String[] args){
        // main method
        Person obj = new Person();
        obj.greet();
    }
    public void greet(){
        // non static method greet
        System.out.println("Hello, I am a person!");
    }

}