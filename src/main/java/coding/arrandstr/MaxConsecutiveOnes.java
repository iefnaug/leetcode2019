package coding.arrandstr;

/**
 * Max Consecutive Ones
 *   Go to Discuss
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int consecutive = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                consecutive++;
            }else{
                maxConsecutive = maxConsecutive > consecutive ? maxConsecutive : consecutive;
                consecutive = 0;
            }
        }
        maxConsecutive = maxConsecutive > consecutive ? maxConsecutive : consecutive;
        return maxConsecutive;
    }

    public static void main(String[] args) {
        int []nums = new int[]{
                1,1,0,1,1,1
        };
        int len = findMaxConsecutiveOnes(nums);
        System.out.println(len);
    }

}
