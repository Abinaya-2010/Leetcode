class Solution(object):
    def compressedString(self, word):
        s = ""
        count = 1
        for i in range(1, len(word)):
            if word[i] == word[i-1] and count < 9:
                count += 1
            else:
                s += str(count) + word[i-1]
                count = 1
        s += str(count) + word[-1]
        return s
