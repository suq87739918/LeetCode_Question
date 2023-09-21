package CodeSignal_Q4_level_questions;

public class getMinFlips {
    public static void main(String[] args) {
        System.out.println(getMinFlips("1010"));
    }
    public static int getMinFlips(String pwd) {
        int minFlips = 0; // 记录需要翻转的最小字符数量

        // 遍历字符串，每次检查两个相邻的字符
        for (int i = 0; i < pwd.length(); i += 2) {
            if (pwd.charAt(i) != pwd.charAt(i + 1)) {
                minFlips++; // 如果这两个字符不同，就需要翻转其中一个字符
            }
        }

        return minFlips; // 返回需要翻转的最小字符数量
    }
}
