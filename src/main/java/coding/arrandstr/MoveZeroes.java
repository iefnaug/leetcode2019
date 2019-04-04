package coding.arrandstr;

/**
 * Move Zeroes
 *   Go to Discuss
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num;
            }
        }
        for(int i=index; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int []nums = new int[]{
                0,1,0,3,12
        };
        moveZeroes(nums);
        System.out.println();
    }
}
