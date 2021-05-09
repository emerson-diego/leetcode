public class MergeTwoSortedLists {

    public static void main(String args[]){
        ListNode listNode1Next3 = new ListNode(4);
        ListNode listNode1Next2 = new ListNode(2, listNode1Next3);
        ListNode listNode1Next1 = new ListNode(1, listNode1Next2);

        ListNode listNode2Next3 = new ListNode(4);
        ListNode listNode2Next2 = new ListNode(3, listNode2Next3);
        ListNode listNode2Next1 = new ListNode(1, listNode2Next2);

       // ListNode result =  new MergeTwoSortedLists().mergeTwoLists(listNode1Next1, listNode2Next1);

        new MergeTwoSortedLists().list(listNode1Next1);

        new MergeTwoSortedLists().mergeTwoLists(listNode1Next1, listNode2Next1);
        System.out.println("--------------------------------");
        new MergeTwoSortedLists().list(listNode1Next1);
        //System.out.println(new ReverseInteger().reverse(x));

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                result.next = l1;
                l1 = l1.next;
                result = result.next;
            }
            else{
                result.next = l2;
                l2 = l2.next;
                result = result.next;
            }
        }
            
            while(l1 != null){
                result.next = l1;
                l1 = l1.next;
                result = result.next;
            }
            
            while(l2 != null){
                result.next = l2;
                l2 = l2.next;
                result = result.next;
            }
        
        
        return temp.next;
    }

    public void list(ListNode l){
      
            while(l!=null){
                System.out.println(l.val);
                l = l.next;
            }
              
    }
}

    class ListNode{

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

       

    }
    

