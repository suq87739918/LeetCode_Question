package HashMap;

import java.util.HashMap;

public class Q138_Copy_List_with_Random_Pointer {
    public static void main(String[] args) {

    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val, Object o, Object o1) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();

        if(head == null){
            return null;
        }

        //make a copy of original linkedList with no pointer
        Node cur = head;
        while(cur != null){
            hashMap.put(cur, new Node(cur.val, null, null));
            cur = cur.next;
        }

        //set the pointer
        cur = head;
        while(cur != null){
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}
