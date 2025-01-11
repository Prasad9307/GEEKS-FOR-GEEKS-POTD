You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
Note: pairs should have elements of distinct indexes. 

Examples :

Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 4.
Constraints:
-105 <= target <=105
 2 <= arr.size() <= 105
-105 <= arr[i] <= 105





class Solution:
    def countPairs (self, arr, target) : 
        #Complete the function
        n=len(arr)
        start=0
        end=n-1
        count=0
        while(start<end):
            sums=arr[start]+arr[end];
            if(sums>target):
                end-=1
            elif(sums<target):
                start+=1
            else:
                ele1=arr[start]
                ele2=arr[end]
                count1=0
                count2=0
                while(start<=end and arr[start]==ele1):
                    count1+=1
                    start+=1
                while(start<=end and arr[end]==ele2):
                    count2+=1
                    end-=1
                if(ele1==ele2):
                    count+=count1*(count1-1)/2
                else:
                    count+=count1*count2
        return int(count)