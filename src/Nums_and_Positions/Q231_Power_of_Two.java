package Nums_and_Positions;

public class Q231_Power_of_Two {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    //有一种非常有效的方法可以检查一个数字是否是2的幂，这种方法利用了二进制的一些性质。
    //
    //如果一个数n是2的幂（例如2, 4, 8, 16, 32...），那么它的二进制表示中，有且只有一个位是1，其余的位都是0。例如，4在二进制中表示为100，16在二进制中表示为10000。
    //
    //另外，如果你将一个二进制数n和它减1的结果进行与操作（n & (n-1)），那么得到的结果就是将n的最右边的1变为0。例如，假设n=4，即100，那么n-1=3，即011。那么n & (n-1)就是100 & 011 = 000。
    //
    //基于这种性质，我们就可以通过判断n & (n-1)是否为0来判断一个数是否是2的幂。因为如果一个数是2的幂，那么它的二进制表示中只有一个1，用这个数和它减1的结果做与操作后，结果应该是0。
}
