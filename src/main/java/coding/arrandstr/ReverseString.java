package coding.arrandstr;

public class ReverseString {

    public static void reverseString(char[] s) {
        if(s == null || s.length == 0 || s.length == 1){
            return;
        }
        int i=0, j=s.length-1;
        while (i < j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char []s = {'1','2','3','4','5'};
        reverseString(s);
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + "-");
        }
    }
}
