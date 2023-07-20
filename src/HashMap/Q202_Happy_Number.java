package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q202_Happy_Number {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
