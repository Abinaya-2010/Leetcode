class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        l = []
        for i in set(arr):
            if arr.count(i) == i:
                l.append(i)
                
            
        return max(l) if l else -1