package Two_Pointers;

import org.w3c.dom.NodeList;

public class Q82_Remove_Duplicates_from_Sorted_List_II {
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
        //since head node may need be deleted, so use a dummy node
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode currNode = dummyNode;

        while(currNode.next != null && currNode.next.next != null){
            if(currNode.next.val == currNode.next.next.val){
                int val = currNode.next.val;
                while(currNode.next != null && currNode.next.val == val){
                    currNode.next = currNode.next.next;
                }
            }else{
                currNode = currNode.next;
            }
        }
        return dummyNode.next;
    }
}
