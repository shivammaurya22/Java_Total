public class RemoveDuplicates {
    // #26 LeetCode, Remove Duplicates from the sorted array.
    public int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        int write = 1; // index value
        for (int read = 1; read < nums.length; read++) { // Change here
            if (nums[read] != nums[read - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write; // This returns the count of unique elements
    }

    public static void main(String[] args) {
        // Creating object 
        RemoveDuplicates obj = new RemoveDuplicates();
        int[] nums = {1, 1, 2};
        int res = obj.removeDuplicate(nums);
        
        // Print the number of unique elements
        System.out.println("Number of unique elements: " + res);
        
        // Print the unique elements in the array
        System.out.print("Unique elements: ");
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}