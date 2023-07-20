package Linked_List;

public class Q19_Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode updatedList = removeNthFromEnd(head, 2);
        System.out.println(updatedList.toString());

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;
        while(fast.next != null){
            fast = fast.next;
            if(n-- <= 0){
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
