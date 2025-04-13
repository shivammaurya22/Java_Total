public class FindDuplicates {
    public static int findDuplicate(int[] array){
        int duplicate = 0;
      //  int ones = array[0];
        for(int i = 0;i<array.length; i++){
            for (int j = i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    duplicate++;
                    break;
                }
            }
           
        }
        return duplicate;
    }
    
    // main method is there to call the methods
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,6,2,5,7};
        int num = findDuplicate(array);
        System.out.println(num);
    }
}
