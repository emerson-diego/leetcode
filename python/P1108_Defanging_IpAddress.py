class Solution:
    def defangIPaddr(self, address: str) -> str:
        address = address.replace(".","[.]")
        return address
        

solution =  Solution()
print(solution.defangIPaddr("1.1.1.1"))