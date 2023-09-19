package CodeSignal_Q4_level_questions;

import java.util.HashMap;

public class Q2131_Longest_Palindrome_by_Concatenating_Two_Letter_Words {
    public static void main(String[] args) {

    }
    //Simple rule you will only use those strings which have their reverse in the HashMap
//if you have "yt":2times and "ty":4time you will add minimum of both because only then the string will be palindrome
//now when you have "gg","aa" like this you will just add them
// but you have to check if the "gg":3 or "gg":2, if it is even then you will directly add the length otherwise you will add the length by decreasing by one.
    public int longestPalindrome(String[] words) {
        //第一部分：统计字符串的出现次数
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String w : words){
            if(hashMap.containsKey(w)){
                hashMap.put(w, hashMap.get(w) + 1);
            }else{
                hashMap.put(w, 1);
            }
        }
        //第二部分：构建最长的回文字符串
        //这部分代码遍历 hashMap 的键，并尝试构建最长的回文字符串.
        //如果字符串 s 的两个字符相同（例如 "aa"），那么这样的字符串可以用作回文字符串的两边。如果出现次数是奇数，我们保留一个作为中心（如果还没有中心）。
        //如果字符串 s 的两个字符不同（例如 "ab"），并且其逆序字符串（例如 "ba"）也存在于 hashMap 中，那么我们可以选择这两个字符串的最小出现次数，并将它们用作回文字符串的两边。
        int length = 0;
        int count = 0;
        boolean flag = false;
        for(String s : hashMap.keySet()){
            String str = new StringBuilder(s).reverse().toString();
            if(s.charAt(0) == s.charAt(1)){
                count = hashMap.get(s);
                if(count % 2 != 0){
                    count--;
                    flag = true;
                }
                length += count * 2;
            }else if(s.charAt(0) != s.charAt(1) && hashMap.containsKey(str)){
                length += Math.min(hashMap.get(s), hashMap.get(str)) * 4;
                hashMap.replace(s,0);
            }
        }
        //第三部分：添加中心（如果有）
        //如果 flag 为 true，则表示我们已经找到了一个成对的字符作为回文字符串的中心，所以 length 需要加 2。
        if(flag == true){
            length += 2;
        }
        return length;
    }
}
