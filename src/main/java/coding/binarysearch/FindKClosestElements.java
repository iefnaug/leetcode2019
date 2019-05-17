package coding.binarysearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 * <p>
 * Example 1:
 * Input: [1,2,3,4,5], k=4, x=3
 * Output: [1,2,3,4]
 * Example 2:
 * Input: [1,2,3,4,5], k=4, x=-1
 * Output: [1,2,3,4]
 * Note:
 * The value k is positive and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 10(4)
 * Absolute value of elements in the array and x will not exceed 10(4)
 */
public class FindKClosestElements {
    /**
     * 一定有 x - arr[i] < arr[i + k] -x，i是最终数组的起始位置
     * 此算法寻找最终数组范围在原数组中的起始位置
     * @param arr
     * @param k
     * @param x
     * @return
     */

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int lo = 0, hi = arr.length - k; // [lo, hi] 表示最终数组的范围
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (x - arr[mid] > arr[mid+k] - x)
                lo = mid + 1;
            else
                hi = mid;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            list.add(arr[lo + i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int []list = {
                1,2,3,4,5,6,7,8,9
        };
        FindKClosestElements findKClosestElements = new FindKClosestElements();
        List<Integer> resultList = findKClosestElements.findClosestElements(list, 4, 8);
        System.out.println("over");

    }
}
