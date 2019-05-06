package coding.arrandstr;

/**
 *  Rotate Array
 *   Go to Discuss
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray {

    /**
     * solution1 O(n2)
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k = k % nums.length;
        int times = 0;
        while (times < k){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            times++;
        }
    }

    /**
     * solution2
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k = k % nums.length;
        if(k == 0){
            return;
        }

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    public static void reverse(int[] nums, int left, int right){
        while (left < right){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int []nums = new int[]{
                1,2,3,4,5,6,7
        };
        rotate2(nums, 3);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }
}
