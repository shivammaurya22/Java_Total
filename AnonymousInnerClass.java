class A{
    public void show(){
        System.out.println("In A Show.");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("In B show.");
//     }
// }

class AnonymousInnerClass{
    public static void main(String[] main){
    A obj = new A(){
        public void show(){
            System.out.println("In New show.");
        }
    };
    obj.show(); // In New show. no name of the class but it is the inner class.
    }
}