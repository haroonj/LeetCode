from typing import List


class MajorityElement:
    def majorityElement(self, nums: List[int]) -> int:
        count, maj = 0, None
        for n in nums:
            if count == 0:
                maj = n
            if maj == n:
                count += 1
            else:
                count -= 1
        return maj


test = MajorityElement()
print(test.majorityElement([3, 2, 3]))
