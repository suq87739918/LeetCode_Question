package Binary_Search;

import java.rmi.dgc.VMID;

public class Q875_Koko_Eating_Bananas {
    public static void main(String[] args) {

    }
    public static int minEatingSpeed(int[] piles, int h){
        int left = 1;
        int right = 1;
        for(int pile : piles){
            right = Math.max(pile, right);
        }
        while(left < right){
            int middle = (left + right) / 2;
            int hourSpend = 0;
            for(int pile : piles){
                hourSpend += Math.ceil((double) pile / middle);
            }
            if(hourSpend > h){
                left = middle + 1;
            }else if(hourSpend <= h){
                right = middle;
            }
        }
        return right;
    }
}
