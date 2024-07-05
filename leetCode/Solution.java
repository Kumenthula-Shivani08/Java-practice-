public class Solution {
    static int removeDuplicates(int[] nums) {
        int rd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd + 1;
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        // Check if k == expectedNums.length
        int lengthCheck = (k == expectedNums.length) ? 1 : 0;
        if (lengthCheck == 0) {
            System.out.println("Length mismatch: expected " + expectedNums.length + " but got " + k);
        } else {
            System.out.println("Length matches: " + k);
        }

        // Check if elements in nums match expectedNums
        int elementsMatch = 1;
        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                elementsMatch = 0;
                System.out.println("Element mismatch at index " + i + ": expected " + expectedNums[i] + " but got " + nums[i]);
            }
        }

        if (elementsMatch == 1) {
            System.out.println("All elements match.");
        }

        // Print the result for verification
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
