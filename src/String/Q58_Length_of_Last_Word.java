package String;

public class Q58_Length_of_Last_Word {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "a";
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }
    public static int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        int last = s.length() - 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' ') {
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
