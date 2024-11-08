public class P21_MergeTwoSortedLists {
/*
    public static void main(String args[]) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = new P21_MergeTwoSortedLists().mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;

        ListNode head = list1.val < list2.val ? list1 : list2;
        
        ListNode pre = head;
        list1 = head == list1 ? list1.next : list1;
        list2 = head == list2 ? list2.next : list2;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        if (list1 != null)
            pre.next = list1;
        if (list2 != null)
            pre.next = list2;
        return head;

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
    } */
}
