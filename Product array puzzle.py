Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
Note: Each element is res[] lies inside the 32-bit integer range.

Examples:

Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
Input: arr[] = [12, 0]
Output: [0, 12]
Explanation: For i = 0, res[i] is 0.
For i = 1, res[i] is 12.
Constraints:
2 <= arr.size() <= 105
-100 <= arr[i] <= 100


class Solution:
    def productExceptSelf(self, arr):
        a=[]
        l=1
        p=1
        k=[]
        c=0
        for i in range(len(arr)):
            l=l*arr[i]
            if arr[i]==0:
                c+=1
            else:
                k.append(arr[i])
        for i in k:
            p=p*i
        if c>1:
            for i in range(len(arr)):
                a.append(0)
        elif 0 in arr:
            for i in arr:
                if i==0:
                    a.append(p)
                else:
                    a.append(0)
        else:
            for i in arr:
                a.append(l//i)
        return(a)
