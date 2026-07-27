class Solution(object):
    def maxProfit(self, prices):
        max_sum = 0
        sum = 0
        for i in range(len(prices)-1):
            difference = prices[i+1] - prices[i]
            sum += difference
            if sum < 0:
                sum = 0
            max_sum = max(max_sum, sum)
        return max_sum
        # diff = 0
        # for i in range(0,len(prices)):
        #     for j in range(i+1,len(prices)):
        #         if (prices[j] > prices[i]):
        #             if(prices[j]-prices[i] > diff):
        #                 diff = prices[j] - prices[i]
        # return diff
        