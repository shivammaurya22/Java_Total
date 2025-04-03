public class ReverseArray{
    public static void main(String[] args){
        // reverse an array
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
       System.out.print("Array:");
    //    print the array using for loop
        for(int i=1; i <= n; i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        // call the method reverseArrays
        reverseArrays(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }
    // create a static method reverseArrays
    public static void reverseArrays(int[] arr){
        int start = 0;
        int end = arr.length - 1; 
        while(start < end){
            // swap elements using temp variable
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}