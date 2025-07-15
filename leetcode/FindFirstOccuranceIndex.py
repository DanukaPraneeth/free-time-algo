class FindFirstOccuranceIndex:

    '''
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 

    Example 1:

    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
    Example 2:

    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.

    '''

    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        if needle in haystack:
            return haystack.index(needle)
        return -1

    def secondStrStr(self, haystack: str, needle: str) -> int:
        first = haystack.find(needle)
        if first == -1:
            return -1
        
        second = haystack.find(needle, first + 1)
        return second


sol = FindFirstOccuranceIndex()
print(sol.strStr("abcabcabc", "abc"))  # Output: 3
print(sol.strStr("hellohello", "lo"))  # Output: 7
print(sol.strStr("abcdef", "gh"))      # Output: -1
print(sol.strStr("ababab", "ab"))      # Output: 2
print(sol.strStr("aaa", "aa"))
print("-------")
print(sol.secondStrStr("abcabcabc", "abc"))  # Output: 3
print(sol.secondStrStr("hellohello", "lo"))  # Output: 7
print(sol.secondStrStr("abcdef", "gh"))      # Output: -1
print(sol.secondStrStr("ababab", "ab"))      # Output: 2
print(sol.secondStrStr("aaa", "aa"))

'''
str.find(sub[, start[, end]])
	•	Returns the lowest index of sub in the string.
	•	If sub is not found, it returns -1.
	•	Safe to use when you’re not sure the substring exists.

str.index(sub[, start[, end]])
	•	Works exactly like find(), BUT:
	•	If sub is not found, it raises a ValueError.
	•	Use it only when you’re confident the substring is present, or wrap in try block.
'''