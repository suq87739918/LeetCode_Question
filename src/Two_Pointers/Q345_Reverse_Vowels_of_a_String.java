package Two_Pointers;

public class Q345_Reverse_Vowels_of_a_String {
    public static void main(String[] args) {

    }
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        char[] word = s.toCharArray();

        while(start < end){
            if(!isVowels(word[start])){
                start++;
            }else if(!isVowels(word[end])){
                end--;
            }else{
                char temp = word[start];
                word[start] = word[end];
                word[end] = temp;
                start++;
                end--;
            }
        }
        return new String(word);
    }
    private boolean isVowels(char letter){
        if(letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            return true;
        }else{
            return false;
        }
    }
}
/*
String类的toCharArray()方法用于将字符串转换为字符数组。

例如，对于String s = "hello";，如果你调用s.toCharArray();，你会得到一个包含'h', 'e', 'l', 'l', 'o'的字符数组，也就是{'h', 'e', 'l', 'l', 'o'}。

这个方法主要在处理需要逐个字符操作的情况下有用。由于字符串在Java中是不可变的（也就是说，一旦创建，就无法更改其内容），
因此对字符串的修改通常会涉及到创建新的字符串对象，这可能导致效率问题。相比之下，字符数组是可以修改的，所以在处理大量的字符串操作时，将字符串转换为字符数组可以带来更高的效率。
 */