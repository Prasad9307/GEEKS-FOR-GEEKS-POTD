// Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

// Examples:

// Input: mat[][] = [[1, 2, 3],
//                 [4, 5, 6]
//                 [7, 8, 9]]
// Output: Rotated Matrix:
// [3, 6, 9]
// [2, 5, 8]
// [1, 4, 7]
// Input: mat[][] = [[1, 2],
//                 [3, 4]]
// Output: Rotated Matrix:
// [2, 4]
// [1, 3]
// Constraints:
// 1 ≤ n ≤ 102
// 0 <= mat[i][j] <= 103


class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        
        for(int i = 0;i<n;i++){
            int j = i<=n/2 ? i : n-i;
            while(j<n){
                int temp = mat[i][j];
                mat[i][j] = mat[n-j-1][i];
                mat[n-j-1][i] = temp;
                j++;
            }
        }
        return;
   }

}
