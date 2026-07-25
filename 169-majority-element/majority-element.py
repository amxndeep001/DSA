class Solution(object):
    def majorityElement(self, nums):
        nums.sort()
        length = (len(nums)/2)
        return nums[length]
        