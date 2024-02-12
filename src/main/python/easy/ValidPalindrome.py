class ValidPalindrome:
    def isPalindrome(self, s: str) -> bool:
        p1, p2 = 0, len(s) - 1
        while p1 < p2:
            a, b = s[p1].lower(), s[p2].lower()
            if a.isalnum() and b.isalnum():
                if a != b:
                    return False
                else:
                    p1, p2 = p1 + 1, p2 - 1
                    continue
            p1, p2 = p1 + (not a.isalnum()), p2 - (not b.isalnum())
        return True


test = ValidPalindrome()
print(test.isPalindrome("A man, a plan, a canal: Panama"))
