public class SumElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,21,34,45};
        int sum = sumElement(array);
        System.out.println(sum);
    }
    public static int sumElement(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
