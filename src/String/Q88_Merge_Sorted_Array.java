package String;

public class Q88_Merge_Sorted_Array {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = m - 1;
        int pt2 = n - 1;

        int pOverall = n + m - 1;

        while(pt1 >= 0 && pt2 >= 0){
            if(nums1[pt1] > nums2[pt2]){
                nums1[pOverall] = nums1[pt1];
                pt1--;
            }else{
                nums1[pOverall] = nums1[pt2];
                pt2--;
            }
            pOverall--;
        }
    }
}
