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
    }
}
