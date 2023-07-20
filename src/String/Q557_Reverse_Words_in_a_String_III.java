package String;

public class Q557_Reverse_Words_in_a_String_III {
    public static void main(String[] args) {

    }
    public String reverseWords(String s) {
        if(s.length() <= 1 || s == null){
            return s;
        }
        char[] str = s.toCharArray();
        int start = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == ' '){
                reverse(str, start, i - 1);
                start = i + 1;
            }else if(i == str.length - 1){
                reverse(str, start, i);
            }
        }
        return String.valueOf(str);
    }
    private void reverse(char[] str, int start, int end){
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
