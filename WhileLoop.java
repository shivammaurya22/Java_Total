public class WhileLoop {
    public static void main(String[] args) {
        // main Method.
        int[] arr = {1,2,3,4,6,7,8};
        int target = 7;
        findPairWithSum(arr, target);
    }

    // create a method to find pair with sum 
    public static void findPairWithSum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
        int currentSum = arr[start] + arr[end];

        if(currentSum == target){
            System.out.println("Pair Found: "+ arr[start] +" and "+ arr[end]);
            return;
        }else if(currentSum < target){
            start++;
        }else{
            end--;
        }
    }
    System.out.println("No Pair Found: "+ target);
    }
}
