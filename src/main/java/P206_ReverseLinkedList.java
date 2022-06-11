public class P206_ReverseLinkedList {

    public static void main(String args[]) {
        ListNode list5 = new ListNode(5);
        ListNode list4 = new ListNode(4, list5);
        ListNode list3 = new ListNode(3, list4);
        ListNode list2 = new ListNode(2, list3);
        ListNode list1 = new ListNode(1, list2);

        ListNode list = list1;
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }

        System.out.println("\n ------------------------ \n");

        P206_ReverseLinkedList rll = new P206_ReverseLinkedList();
        ListNode rllReversed = rll.reverseList(list1);

        while (rllReversed != null) {
            System.out.println(rllReversed.val);
            rllReversed = rllReversed.next;
        }

    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
           return head;
       }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }

}

class ListNode {
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
}