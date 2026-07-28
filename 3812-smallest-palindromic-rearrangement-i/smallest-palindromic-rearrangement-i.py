
class Solution:
    def smallestPalindrome(self, s):
        freq = [0] * 26

        for ch in s:
            freq[ord(ch) - ord('a')] += 1
        
        left = []
        middle = ""
        
       
        for i in range(26):
            if freq[i] > 0:
                left.append(chr(i + ord('a')) * (freq[i] // 2))
                
                if freq[i] % 2 == 1:
                    middle = chr(i + ord('a'))
        
        left_half = "".join(left)
        
        return left_half + middle + left_half[::-1]