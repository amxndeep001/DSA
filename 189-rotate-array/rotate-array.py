class Solution(object):
    def rotate(self, nums, k):
        k = k % len(nums)
        l,r = 0,len(nums)-1
        while l < r:
            nums[l],nums[r] = nums[r],nums[l]   
            l,r = l+1,r-1

        l,r=0,k-1             #7 6 5 4 3 2 1          k=3
        while l < r:
            nums[l],nums[r] = nums[r],nums[l]
            l,r = l+1,r-1

        l,r = k,len(nums)-1
        while l < r:
            nums[l],nums[r] = nums[r],nums[l]
            l,r = l+1,r-1

        return nums 