package coding.binarysearch;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 *
 * Example 2:
 *
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 *
 *
 * Note:
 *
 * You may assume that all elements in nums are unique.
 * n will be in the range [1, 10000].
 * The value of each element in nums will be in the range [-9999, 9999].
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        if(left > right){
            return -1;
        }
        int mid = (left + right)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, left, mid-1, target);
        }else{
            return binarySearch(nums, mid+1, right, target);
        }
    }


    public int search2(int[] nums, int target){
        int left = 0, right = nums.length-1;
        int mid = right/2;
        for(;;){
            if(left > right){
                return -1;
            }
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
                mid = (left + right)/2;
            }else{
                right = mid - 1;
                mid = (left + right)/2;
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = new int[]{
                -1,0,3,5,9,12
        };
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search2(nums, 9);
        System.out.println(index);
    }

}
