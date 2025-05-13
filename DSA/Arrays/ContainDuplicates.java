public class ContainDuplicates {
    public boolean ContainsDup(int[] arr){
        for(int  i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                return true;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        ContainDuplicates obj = new ContainDuplicates();
        int[] arr = {1,2,3,1};
       boolean res = obj.ContainsDup(arr);
       System.out.println(res);
    }
}
