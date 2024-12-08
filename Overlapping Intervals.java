// Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

// Examples:

// Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
// Output: [[1,4], [6,8], [9,10]]
// Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].
// Input: arr[][] = [[6,8],[1,9],[2,4],[4,7]]
// Output: [[1,9]]
// Explanation: In the given intervals all the intervals overlap with the interval [1,9]. Therefore we will return [1,9].
// Constraints:
// 1 ≤ arr.size() ≤ 105
// 0 ≤ starti ≤ endi ≤ 105 


class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int[] interval : arr) {
            pq.offer(interval);
        }
        
        List<int[]> ans = new ArrayList<>();
        int[] current = pq.poll();
        while (!pq.isEmpty()) {
            int[] next = pq.poll();
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                ans.add(current);
                current = next;
            }
        }
        ans.add(current);
        return ans;
    }
}
