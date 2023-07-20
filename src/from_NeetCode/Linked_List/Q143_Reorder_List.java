public class Q143_Reorder_List {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
    public static void reorderList(ListNode head){
        //这一部分的作用是找到ListNode的中间节点，fast的速度是slow的两倍，所以当fast达到末尾时，slow刚好在中间
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //这部分作用是把找出来的中间节点之后的ListNode反转

        //这里是为了把第一段ListNode的结尾加一个pointer指向null
        ListNode prev = slow.next = null;
        //这里是指定中间节点的next节点为第二个ListNode的起始节点
        ListNode second = slow.next;
        //reverse
        while(second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        //merge两个ListNode
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}
