The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.

Given an integer n, find all distinct solutions to the n-queens puzzle.
You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n]. In this representation, the number in the ith position denotes the row in which the queen is placed in the ith column.
For eg. below figure represents a chessboard [3 1 4 2].



Examples:

Input: n = 1
Output: [1]
Explaination: Only one queen can be placed in the single cell available.
Input: n = 4
Output: [[2 4 1 3 ] [3 1 4 2 ]]
Explaination: There are 2 possible solutions for n = 4.
Input: n = 2
Output: []
Explaination: There are no possible solutions for n = 2.
Constraints:
1 ≤ n ≤ 10


class Solution:
    def canAppend(self, vis, ar, val):
        possible = not vis[val-1]
        for i, v in enumerate(ar):
            diff = len(ar) - i
            possible = possible and (v-diff != val) and (v+diff != val)
        return possible
        
    def backtrack(self, vis, ar):
        if len(ar) == len(vis):
            return [ar[:]]

        res = []
        for i in range(1, n+1):
            if not self.canAppend(vis, ar, i):
                continue

            vis[i-1] = True
            ar.append(i)
            res += self.backtrack(vis, ar)
            ar.pop()
            vis[i-1] = False
            
        return res
    
    def nQueen(self, n):
        # code here
        vis = [False]*n
        ar = []
        return self.backtrack(vis, ar)
