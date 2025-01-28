from typing import List


class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        
        frequency = {}
        for i in nums:
            if i in frequency:
                frequency[i] += 1
            else:
                frequency[i] = 1
        
        return [key for key, value in frequency.items() if value == 2]
        

solution = Solution()
print(solution.getSneakyNumbers([0,1,1,0]))
