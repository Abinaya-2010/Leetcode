class Solution(object):
     def is_vowel(self, c):
        return c in "aeiouAEIOU"
     def toGoatLatin(self, sentence):
        """
        :type sentence: str
        :rtype: str
        """
        words = sentence.split()
        res = []
        for i in range(len(words)):
            w = words[i]
            if self.is_vowel(w[0]):
                res.append(w + "ma" + "a" * (i + 1))
            else:
                res.append(w[1:] + w[0] + "ma" + "a" * (i + 1))
        return " ".join(res)
