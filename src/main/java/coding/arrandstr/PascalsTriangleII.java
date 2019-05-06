package coding.arrandstr;

import java.util.ArrayList;
import java.util.List;

/**
 *Pascal's Triangle II
 *   Go to Discuss
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */
public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            list.add(1);
        }
        if(rowIndex < 2){
            return list;
        }
        calculate(list, rowIndex);
        return list;
    }

    private static void calculate(List<Integer> list, int rowIndex) {
        if(rowIndex < 2){
            return;
        }
        calculate(list, rowIndex - 1);
        for(int i=rowIndex-1; i>0; i--){
            list.set(i, list.get(i) + list.get(i-1));
        }
    }


    public static void main(String[] args) {
        List<Integer> list = getRow(10);
        list.stream().forEach((each)->{
            System.out.print(each + ", ");
        });
    }
}
