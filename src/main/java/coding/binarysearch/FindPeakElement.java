package coding.binarysearch;

/**
 * Find Peak Element
 *   Go to Discuss
 * A peak element is an element that is greater than its neighbors.
 *
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 *
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * Example 2:
 *
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 *              or index number 5 where the peak element is 6.
 * Note:
 *
 * Your solution should be in logarithmic complexity.
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        int left = 0, right = nums.length - 1;
        return find(left, right, nums);
    }

    private int find(int left, int right, int[] nums){
        if(left > right){
            return -1;
        }
        int mid = left + (right - left) / 2;
        if(mid == 0){
            if(nums[mid] > nums[mid+1]){
                return mid;
            }else {
                return find(mid + 1, right, nums);
            }
        }else if(mid == nums.length - 1){
            if (nums[mid] > nums[mid-1]){
                return mid;
            }else {
                return find(left, mid - 1, nums);
            }
        }else if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
            return mid;
        }else {
            int leftIndex = find(left, mid - 1, nums);
            if(leftIndex >= 0){
                return leftIndex;
            }
            int rightIndex = find(mid + 1, right, nums);
            if (rightIndex >= 0){
                return rightIndex;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []nums = {
                1,2,1,3,5,6,4
        };

        FindPeakElement findPeakElement = new FindPeakElement();
        int index = findPeakElement.findPeakElement(nums);
        System.out.println(index);
    }
}
