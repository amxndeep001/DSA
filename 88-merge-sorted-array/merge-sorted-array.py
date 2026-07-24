class Solution(object):
    def merge(self, nums1, m, nums2, n):
        nums1.extend(nums2)
        nums1.sort()
        for i in range(n):
            del nums1[nums1.index(0)]
        


        