public class P88_MergeSortedArray {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Índices para o último elemento de cada array e para a posição de inserção final
        int index1 = m - 1, index2 = n - 1, insertPos = m + n - 1;
        
        // Percorrer os arrays de trás para frente
        while (index1 >= 0 && index2 >= 0) {
            // Colocar o maior elemento na posição correta em nums1
            if (nums1[index1] > nums2[index2]) {
                nums1[insertPos] = nums1[index1];
                index1--;
            } else {
                nums1[insertPos] = nums2[index2];
                index2--;
            }
            insertPos--;
        }
        
        // Copiar elementos restantes de nums2 para nums1 se houver
        while (index2 >= 0) {
            nums1[insertPos] = nums2[index2];
            index2--;
            insertPos--;
        }
    }
}
