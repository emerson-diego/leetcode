from typing import List

class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:

        return nums + nums

# Criando uma instância da classe
solution = Solution()
print(solution.getConcatenation([1,2,1]))