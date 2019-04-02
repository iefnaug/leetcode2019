package coding.arrandstr;

/**
 * Reverse Words in a String
 *   Go to Discuss
 * Given an input string, reverse the string word by word.
 *
 *
 *
 * Example 1:
 *
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 *
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 *
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 *
 *
 * Note:
 *
 * A word is defined as a sequence of non-space characters.
 * Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
 * You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsinaString {

    public static String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        int start = 0, end = 0;

        char[] characters = s.toCharArray();
        char[] newCharacters = new char[characters.length];
        int index = 0;

        for(int i=0; i<characters.length; i++){
            if(characters[i] == ' ' && start == end){
                start++;
                end++;
            }else if(characters[i] == ' ' && start < end){
                index = append(characters, start, end - 1, newCharacters, index);
                start = ++end;
            }else{
                end++;
            }

            if(i == characters.length-1 && start < end){
                index = append(characters, start, end - 1, newCharacters, index);
            }
        }
        reverse(newCharacters, 0 , index - 1);

        return new String(newCharacters, 0, index);
    }

    private static void reverse(char []characters, int left, int right){
        while(left < right){
            char tmp = characters[left];
            characters[left] = characters[right];
            characters[right] = tmp;
            right--;
            left++;
        }
    }

    private static int append(char []characters, int left, int right, char[] newCharacters, int index){
        if(index != 0){
            newCharacters[index++] = ' ';
        }
        for(int i=right; i>=left; i--){
            newCharacters[index++] = characters[i];
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "2";
        String result = reverseWords(str);
        System.out.println(result);
    }


}
