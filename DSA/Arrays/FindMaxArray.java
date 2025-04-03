public class FindMaxArray {
    public static void main(String[] args) {
        // Find the MAX element in the array
        int[] array = {2,4,6,8,12,34,23,21};
        int maxElement = array[0];
        for(int i =1; i < array.length;i++){
            if(maxElement < array[i]){
                maxElement = array[i];
            }
        }
        System.out.println(maxElement);
    }
}
