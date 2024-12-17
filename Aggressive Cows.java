Aggressive Cows
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.

Examples :

Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0], 
the second cow can be placed at stalls[2] and 
the third cow can be placed at stalls[3]. 
The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows, in this case, is 4, which also is the largest among all possible ways.
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: Each cow can be placed in any of the stalls, as the no. of stalls are exactly equal to the number of cows.
The minimum distance between cows, in this case, is 1, which also is the largest among all possible ways.
Constraints:
2 <= stalls.size() <= 106
0 <= stalls[i] <= 108
1 <= k <= stalls.size()


class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // Step 1: Sort the stalls
        Arrays.sort(stalls);

        // Step 2: Initialize binary search range
        int low = 1, high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        // Step 3: Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Step 4: Check if placement is possible with 'mid' distance
            if (canPlaceCows(stalls, k, mid)) {
                result = mid; // Update result
                low = mid + 1; // Try for a larger distance
            } else {
                high = mid - 1; // Try for a smaller distance
            }
        }

        return result;
    }

    // Helper function to check if cows can be placed with at least 'distance' apart
    private static boolean canPlaceCows(int[] stalls, int k, int distance) {
        int count = 1; // Place the first cow in the first stall
        int lastPosition = stalls[0]; // Position of the last placed cow

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                count++; // Place another cow
                lastPosition = stalls[i]; // Update last position

                if (count == k) {
                    return true; // All cows placed successfully
                }
            }
        }

        return false; // Not enough space to place all cows
    }
}
