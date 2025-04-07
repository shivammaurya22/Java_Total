public class Enums4 {
    enum Laptop{
        Mac(1000), Dell(800), Asus,IPad(700);

        private int price;
        private Laptop(){  // if anyone can't hold the price then default constructor is assigned to 500 value.
          price = 500;
        }
        private Laptop(int price){
            this.price = price;
        }
        public int getData(){
           return price;
        }
    }
    public static void main(String[] args) {
        Laptop[] lap = Laptop.values();
        for(Laptop l : lap){
            System.out.println(l + " : "+ l.getData());
        }
    }
}
