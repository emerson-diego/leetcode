from typing import List

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        dictionary = {}
        goodPairs = 0
        
        for num in nums:
            if(num in dictionary):
                count = dictionary[num]
                goodPairs += count
                dictionary[num] += count
            else:
                dictionary[num] = 1
        
        return goodPairs
        

solution = Solution()
nums = [1,2,3,1,1,3]
print(solution.numIdenticalPairs(nums))