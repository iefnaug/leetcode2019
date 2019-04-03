package coding.arrandstr;

/**
 * Remove Duplicates from Sorted Array
 *   Go to Discuss
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 * Clarification:
 *
 * Confused why the returned value is an integer but your answer is an array?
 *
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 *
 * Internally you can think of this:
 *
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 *
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return 1;
        }

        int index = 0;
        int end = nums.length-1;
        for(;;){
            int duplicate_index = index + 1;
            while(nums[duplicate_index] == nums[index] ){
                if(++duplicate_index > end){
                    return index+1;
                }
            }
            if(nums[duplicate_index] != nums[index]){
                if(duplicate_index - index > 1){
                    System.arraycopy(nums, duplicate_index, nums, index+1, end - duplicate_index + 1);
                    end = end - (duplicate_index - index - 1);
                }
                if(++index == end){
                    return index+1;
                }
            }
        }
    }

    /**
     * 快慢指针
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i=0;
        for(int num : nums){
            if(num > nums[i]){
                nums[++i] = num;
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int []nums = new int[]{
                0,0,1,1,1,2,2,3,3,3,4,5,6,6,6,6
//                1,2,3,4,5,6,6,6,6
        };
        int len = removeDuplicates2(nums);
        System.out.println(len);
    }
}
