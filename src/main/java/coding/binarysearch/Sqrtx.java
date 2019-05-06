package coding.binarysearch;

/**
 * Sqrt(x)
 *   Go to Discuss
 * Implement int sqrt(int x).
 *
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 *
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 *
 * Example 1:
 *
 * Input: 4
 * Output: 2
 * Example 2:
 *
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 *              the decimal part is truncated, 2 is returned.
 */
public class Sqrtx {

    public int mySqrt(int x) {
//        long val;
//        int left = 0, right =x;
//        int mid = right/2;
//        while(left <= right){
//            val = mid * mid;
//            if(val == x){
//                return mid;
//            }else if(val > x){
//                right = mid - 1;
//                val = right * right;
//                if(val <= x){
//                    return right;
//                }
//                mid = left + (right - left)/2;
//            }else {
//                left = mid + 1;
//                val = left * left;
//                if(val == x){
//                    return left;
//                }else if(val > x){
//                    return mid;
//                }
//                mid = left + (right - left)/2;
//            }
//        }
//        val = mid * mid;
//        return val > x ? (mid - 1) : mid;

        //TODO ？？？没搞懂
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int)r;

    }

    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        int num = sqrtx.mySqrt(2147395599);
        System.out.println(num);
    }
}
