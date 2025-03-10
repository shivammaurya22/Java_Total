public class BasicArr {
    public static void main(String[] args) {
        String[] names = {"Shivam","Shubham","Satyam","Julee","Sandhya"};
        for(int i = 0; i <=names.length - 1; i++){
            System.out.println("The "+ i+" name is "+ names[i]);
        }
        System.out.println("Length of the Array: "+ names.length);
        String[] cars = new String[5];
        cars[0] = "Mustang Gt";
        cars[1] = "BMW";
        cars[2] = "Tata EV";
        cars[3] = "Ford";
        cars[4] = "Lamborgini";
        for(int j = 0; j <= cars.length-1;j++){
            System.out.println(cars[j]);
        }
    }
}
