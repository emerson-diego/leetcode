import java.util.HashSet;
import java.util.Set;

public class P83_RemoveDupicatesFromSortedList {

    public ListNode_ deleteDuplicates(ListNode_ head) {
        if (head == null || head.next == null) {
            return head;
        }

        Set<Integer> lista = new HashSet<>();

        ListNode_ node = head;
        ListNode_ nodeAnterior = null; // Inicialmente null, pois ainda não temos um 'anterior' no começo

        while (node != null) {
            if (lista.contains(node.val)) {
                // Removendo o nó duplicado ajustando o ponteiro 'next' do nó anterior
                nodeAnterior.next = node.next;
            } else {
                // Adicionando o valor à lista e atualizando o nó 'anterior'
                lista.add(node.val);
                nodeAnterior = node;
            }
            // Avançando para o próximo nó
            node = node.next;
        }

        return head;
    }
}

class ListNode_ {
    int val;
    ListNode_ next;

    ListNode_() {
    }

    ListNode_(int val) {
        this.val = val;
    }

    ListNode_(int val, ListNode_ next) {
        this.val = val;
        this.next = next;
    }
}
