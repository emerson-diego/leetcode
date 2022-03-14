public class P21_MergeTwoSortedLists {

    public static void main(String args[]) {

        ListNode list1[] = { 1, 2, 4 };
        ListNode list2[] = { 1, 3, 4 };

        ListNode result = new P21_MergeTwoSortedLists().mergeTwoLists(list1, list2);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(item);
        }

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result[] = {};

        // for (int i = 0; i < list1.size(); i++) {

        // for (int j = 0; i < list2.size(); j++) {

        // }
        // }

        while (list1 != null && list2 != null) {
            if (list1 != null && list2 != null && list1.val <= list2.val) {

                ListNode menor = list1;
                list1.

                if (result == null) {
                    ListNode newItem = new ListNode(menor.val, null);
                    result = newItem;
                } else {
                    ListNode newItem = new ListNode(menor.val, null);
                    result.next = newItem;
                }

            }
        }

        return result;

    }

}

public class ListNode {
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
