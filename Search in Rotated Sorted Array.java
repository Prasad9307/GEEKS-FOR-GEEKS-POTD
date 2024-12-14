Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
1 ≤ key ≤ 106

class Solution {
    int search(int[] arr, int key) {
        int index=0;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                index = i;
                flag=1;
            }
        }
        if(flag==1){
            return index;
        }
        return -1;
    }
}
