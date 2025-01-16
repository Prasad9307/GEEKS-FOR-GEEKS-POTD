Given an array arr of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

Examples:

Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
Output: 6
Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
Input: arr[] = [0, 0, 1, 1, 0]
Output: 4
Explnation: arr[0...3] or arr[1...4] is the longest subarray with two 0s and two 1s.
Input: arr[] = [0]
Output: 0
Explnation: There is no subarray with an equal number of 0s and 1s.
Constraints:
1 <= arr.size() <= 105
0 <= arr[i] <= 1



class Solution:
    def maxLen(self, arr):
        preSum={0:-1}
        currSum=0
        ans=0
        for i in range(len(arr)):
            currSum+= (1 if arr[i] else -1)
            if currSum in preSum:
                ans=max(ans,i-preSum[currSum])
            if currSum not in preSum:
                preSum[currSum]=i
        return ans
