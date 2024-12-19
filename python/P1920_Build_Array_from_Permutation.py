from typing import List


class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        finalArray = []
        for i in range(len(nums)):
            finalArray.append(nums[nums[i]]) 
        return finalArray

# Criando uma instância da classe
solution = Solution()
print(solution.buildArray([0,2,1,5,3,4]))