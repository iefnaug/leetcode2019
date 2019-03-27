package coding.arrandstr;

import java.util.Arrays;
import java.util.Collections;

/**
 * Array Partition I
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example 1:
 * Input: [1,4,3,2]
 *
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */
public class ArrayPartition1 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=nums.length-2, sum=0;
        while (i <= j){
            if(i==j){
                sum += nums[i];
            }else{
                sum += (nums[i] + nums[j]);
            }
            i += 2;
            j -= 2;
        }
        return sum;
    }

    public static int arrayPairSum2(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }

    /**
     * TODO 排序的时候将结果累加出来
     * @param nums
     * @return
     */
    public static int arrayPairSum3(int[] nums) {
        return 0;
    }


    public static void main(String[] args) {
        int nums[] = new int[100];
        for(int i=1; i<=100; i++){
            nums[i-1] = i;
        }
        int sum = arrayPairSum2(nums);
        System.out.println(sum);
    }
}
