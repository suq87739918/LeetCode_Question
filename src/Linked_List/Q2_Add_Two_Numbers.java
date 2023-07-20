package Linked_List;

public class Q2_Add_Two_Numbers {
    public static void main(String[] args) {

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyNode = new ListNode();
            ListNode current = dummyNode;
            int carry = 0;
            while (l1 != null || l2 != null || carry != 0) {
                int l1Val = (l1 != null) ? l1.val : 0;
                int l2Val = (l2 != null) ? l2.val : 0;
                int sum = l1Val + l2Val + carry;
                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            return dummyNode.next;
        }
    }
}
