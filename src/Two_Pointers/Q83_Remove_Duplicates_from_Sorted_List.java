package Two_Pointers;

import java.util.List;

public class Q83_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while(currNode != null && currNode.next != null){
            if(currNode.val == currNode.next.val){
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
        }
        return head;
    }
}
