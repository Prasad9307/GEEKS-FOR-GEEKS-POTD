'''Sum Pair closest to target
Difficulty: EasyAccuracy: 44.75%Submissions: 41K+Points: 2
Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

Examples:

Input: arr[] = [10, 30, 20, 5], target = 25
Output: [5, 20]
Explanation: As 5 + 20 = 25 is closest to 25.
Input: arr[] = [5, 2, 7, 1, 4], target = 10
Output: [2, 7]
Explanation: As (4, 7) and (2, 7) both are closest to 10, but absolute difference of (2, 7) is 5 and (4, 7) is 3. Hence, [2, 7] has maximum absolute difference and closest to target. 
Input: arr[] = [10], target = 10
Output: []
Explanation: As the input array has only 1 element, return an empty array.
Constraints:
1 <= arr.size() <= 2*105
0 <= target<= 2*105
0 <= arr[i] <= 105'''

class Solution:
    def sumClosest(self, arr, target):
        # Sort the array
        arr.sort()
        left = 0  # Start pointer at the beginning
        right = len(arr) - 1  # Start pointer at the end
        closest_sum = float('inf')  # Initialize to infinity
        closest_pair = []  # To store the closest pair
        
        while left < right:
            current_sum = arr[left] + arr[right]
            
            # Update the closest pair if a closer sum is found
            if abs(target - current_sum) < abs(target - closest_sum):
                closest_sum = current_sum
                closest_pair = [arr[left], arr[right]]
                
            # Adjust pointers based on the comparison of current_sum and target
            if current_sum < target:
                left += 1
            elif current_sum > target:
                right -= 1
            else:
                # Exact match found
                return [arr[left], arr[right]]
        
        # Return the closest pair
        return closest_pair

