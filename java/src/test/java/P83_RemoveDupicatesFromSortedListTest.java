import org.junit.jupiter.api.Test;

public class P83_RemoveDupicatesFromSortedListTest {
    
    P83_RemoveDupicatesFromSortedList removeDupicatesFromSortedList = new P83_RemoveDupicatesFromSortedList();
    
    private static String listaParaString(ListNode_ head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append("->");
            }
            head = head.next;
        }
        return sb.toString();
    }
    
    @Test
    public void testaListaVazia() {
        ListNode_ head = null;
        head = removeDupicatesFromSortedList.deleteDuplicates(head);
        assert head == null : "Falha no teste com lista vazia";
    }
    
    @Test
    public void testaListaSemDuplicatas() {
        ListNode_ head = new ListNode_(1, new ListNode_(2, new ListNode_(3)));
        head = removeDupicatesFromSortedList.deleteDuplicates(head);
        assert listaParaString(head).equals("1->2->3") : "Falha no teste com lista sem duplicatas";
    }
    
    @Test
    public void testaListaTodasDuplicatas() {
        ListNode_ head = new ListNode_(1, new ListNode_(1, new ListNode_(1)));
        head = removeDupicatesFromSortedList.deleteDuplicates(head);
        assert listaParaString(head).equals("1") : "Falha no teste com lista todas duplicatas";
    }
    
    @Test
    public void testaListaAlgumasDuplicatas() {
        ListNode_ head = new ListNode_(1, new ListNode_(1, new ListNode_(2, new ListNode_(3, new ListNode_(3)))));
        head = removeDupicatesFromSortedList.deleteDuplicates(head);
        assert listaParaString(head).equals("1->2->3") : "Falha no teste com lista algumas duplicatas";
    }
    
    @Test
    public void testaListaGrande() {
        ListNode_ head = new ListNode_(1);
        for (int i = 2; i <= 1000; i++) {
            head = new ListNode_(i, head);
        }
        head = removeDupicatesFromSortedList.deleteDuplicates(head);
        // Verifique se a lista resultante está correta
    }
}
