class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res ={}

        for i in nums:
            res[i] = res.get(i,0)+1
        arr =[]
        for count,tar in res.items():
            arr.append([tar,count])
        arr.sort()
        final = []
        while len(final)<k:
            final.append(arr.pop()[1])
        
        return final
        
