// Spirally traversing a matrix
// You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

// Examples:

// Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
// Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
// Explanation: 

// Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
// Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
// Explanation: Applying same technique as shown above.
// Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
// Output: [32, 44, 27, 23, 62, 50, 28, 54]
// Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
// Constraints:
// 1 <= n, m <= 1000
// 0 <= mat[i][j]<= 100  
  
  class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int dgnl=0;
        int x=Math.min(n,m);
        while(dgnl<x){
            boolean anyUpdate=false;
            
            int i=dgnl;
            int j=dgnl;
            
            //->
            while(j<(m-dgnl)){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(j==(m-1-dgnl))
                    break;
                j++;
                
            }
           if(anyUpdate==false)
                break;
            anyUpdate=false;
            
            
            
            
            //down
            i++;
            while(i<(n-dgnl)){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(i==(n-1-dgnl))
                    break;
                i++;
                
            }
            if(anyUpdate==false)
                break;
            anyUpdate=false;
            
            
            
            
            
            //<-
            j--;
            while(j>=dgnl){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(j==dgnl)
                    break;
                j--;
                
            }
            if(anyUpdate==false)
                break;
            anyUpdate=false;
                        
            
            
            
            
            
            //up
            i--;
            while(i>dgnl){
                ans.add(mat[i][j]);
                anyUpdate=true;
                if(i==(dgnl+1))
                    break;
                i--;    
            }
            
            if(anyUpdate==false)
                break;
            dgnl++;   
        }
        
        return ans;
        
    }
}

