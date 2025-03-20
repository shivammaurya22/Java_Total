public class Jarray {
    public static void main(String[] args) {
        // Main Method 
        // there are 2 ideas to create array
        int[] arrays = new int[5];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        arrays[3] = 4;
        arrays[4] = 5;

        // using for loop to print array
        for(int i =0; i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
        
        // idea 2. common use 
        int[] numbers = {1,2,3,4,5,6};
        for(int j : numbers){
            System.out.println(j);
        } 
        // other method 
        int nums[] = {1,2,43,54,56};
        for(int k : nums){
            System.out.println(k);
        }
        // dynamically define
        int numsDy[] = new int[4];
        numsDy[0] = 24;
        numsDy[1] = 36;
        numsDy[2] = 20;
        numsDy[3] = 22;

        for(int y : numsDy){
            System.out.println(y);
        }
    }
}
