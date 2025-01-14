from typing import List

class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        value = 0
        
        for x in operations:
            if(x == "++X" or x == "X++"):
                value += 1
            elif(x == "--X" or x == "X--"):
                value -= 1
        
        return value
        

solution = Solution()
array = ["--X","X++","X++"]
finalValue = solution.finalValueAfterOperations(array)
print(finalValue)
