package coding.binarysearch;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */
public class SearchforaRange {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null){
            return new int[]{-1, -1};
        }
        int left = 0, right = nums.length - 1, mid = -1;
        boolean found = false;
        while (left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                found = true;
                break;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        if(!found){
            return new int[]{-1, -1};
        }
        int leftIndex = mid, rightIndex = mid;
        while (leftIndex > 0){
            if (nums[leftIndex] == nums[leftIndex-1]){
                leftIndex = leftIndex - 1;
            }else {
                break;
            }
        }
        while (rightIndex < nums.length - 1){
            if (nums[rightIndex] == nums[rightIndex+1]){
                rightIndex = rightIndex + 1;
            }else {
                break;
            }
        }
        return new int[]{
                leftIndex, rightIndex
        };
    }

    public static void main(String[] args) {
        int nums[] = new int[]{
                5,7,7,8,8,10
        };

        SearchforaRange searchforaRange = new SearchforaRange();
        int []range = searchforaRange.searchRange(nums, 9);
        System.out.println(range[0] + "," + range[1]);
    }
}
