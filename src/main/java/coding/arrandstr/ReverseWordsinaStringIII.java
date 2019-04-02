package coding.arrandstr;

/**
 * Reverse Words in a String III
 *   Go to Discuss
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsinaStringIII {

    public String reverseWords(String s) {
        if(s == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String words[] = s.split(" ");
        for(int i=0; i<words.length; i++){
            sb.append(reverse(words[i].trim()));
            if(i != words.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String reverse(String str){
        char c[] = str.toCharArray();
        int left = 0, right = c.length - 1;
        while(left < right){
            char tmp = c[left];
            c[left]  = c[right];
            c[right] = tmp;
            left++;
            right--;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        ReverseWordsinaStringIII reverseWordsinaStringIII = new ReverseWordsinaStringIII();
        String newStr = reverseWordsinaStringIII.reverseWords(str);
        System.out.println(newStr);
    }
}
