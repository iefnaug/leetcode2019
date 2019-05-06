package coding.arrandstr;

/**
 * Minimum Size Subarray Sum
 *   Go to Discuss
 * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 *
 * Example:
 *
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
 */
public class MinimumSizeSubarraySum {


    public static int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int minLen = Integer.MAX_VALUE, len = 0, slow = 0, fast = 0, sum = nums[slow];

        for(;;){
            if(sum >= s && slow < fast){
                len = fast - slow + 1;
                minLen = minLen < len ? minLen : len;
                len = 0;
                sum -= nums[slow];
                slow++;
            }else if(sum >= s && slow == fast){
                return 1;
            }else{
                if(fast < nums.length-1){
                    fast++;
                    sum += nums[fast];
                }else{
                    break;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int []nums = new int[]{
                2,3,1,2,4,3
        };
        int len = minSubArrayLen(7,nums);
        System.out.println(len);
    }
}
