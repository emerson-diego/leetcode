from typing import List

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        # Exemplo de reversão in-place
        s[:] = s[::-1]
        print(s)

# Criando uma instância da classe
solution = Solution()
solution.reverseString(["h", "e", "l", "l", "o"])  # Saída: ['o', 'l', 'l', 'e', 'h']
            