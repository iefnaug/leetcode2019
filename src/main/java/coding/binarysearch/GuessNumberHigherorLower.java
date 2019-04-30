package coding.binarysearch;

/**
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 *
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 *
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example :
 *
 * Input: n = 10, pick = 6
 * Output: 6
 */
public class GuessNumberHigherorLower {

    public int guessNumber(int n) {
        int left = 1, right = n, mid = left + (right - left)/2;
        while(left <= right){
            if(guess(mid) < 0){
                right = mid - 1;
            }else if(guess(mid) == 0){
                return mid;
            }else {
                left = mid + 1;
            }
            mid = left + (right - left)/2; //注意越界，不要写成 mid = (left + right) / 2
        }
        return -1;
    }

    private int guess(int num){
        return 0;
    }
}
