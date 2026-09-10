class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        ss = "".join(sorted(s))
        tt = "".join(sorted(t))
        x=0
        for i in range(len(s)):
            if ss[i] == tt[i]:
                x += 1
        if x == len(s):
            return True
        else:
            return False