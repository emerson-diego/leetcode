from typing import List

class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        kelkin = celsius + 273.15
        fahrenheit = celsius * 1.80 + 32
        return [kelkin, fahrenheit]

    
solution = Solution()
print(solution.convertTemperature(36.50))