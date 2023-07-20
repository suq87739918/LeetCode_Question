package HashMap;

public class Q633_Sum_of_Square_Numbers {
    public static void main(String[] args) {

    }
    public boolean judgeSquareSum(int c) {
        for(long a = 0; a * a <= c; a++){
            double b = Math.sqrt(c - a * a);
            if(b == (int)b){
                return true;
            }
        }
        return false;
    }
}
/*
Why we set a to long?

This is to prevent integer overflow.
If c is very large and close to the maximum limit of int,
then a * a could exceed the maximum limit of int and result in an overflow, leading to incorrect results.
By defining a as long, we ensure that a * a will not overflow as long has a much larger maximum limit than int.

Why we set b to double?

The Math.sqrt() function returns a double value.
This is because the square root of a number is not always an integer. For example,
the square root of 2 is approximately 1.4142135, which is not an integer. By defining b as double,
we can store the exact square root value.
 */
