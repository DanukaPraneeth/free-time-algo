class RepeatedSubstringPatter:

    # Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

    def checkIfStringRepeat(self, s: str) -> bool:
        doubled = (s + s)[1 : -1]
        return s in doubled
    

sol = RepeatedSubstringPatter()

print(sol.checkIfStringRepeat("abab"))       # True
print(sol.checkIfStringRepeat("aba"))        # False
print(sol.checkIfStringRepeat("abcabcabcabc")) # True
print(sol.checkIfStringRepeat("abaabaabaaba")) # True