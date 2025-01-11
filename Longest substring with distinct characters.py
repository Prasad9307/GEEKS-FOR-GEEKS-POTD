'''
Given a string s, find the length of the longest substring with all distinct characters. 

Examples:

Input: s = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest substring with all distinct characters.
Input: s = "aaa"
Output: 1
Explanation: "a" is the longest substring with all distinct characters.
Input: s = "abcdefabcbb"
Output: 6
Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
Constraints:
1<= s.size()<=3*104
All the characters are in lowercase
'''
class Solution:
    def longestUniqueSubstr(self, s):
        # Dictionary to store the last index of each character
        last_index = {}
        max_len = 0  # Maximum length of substring with unique characters
        start = 0  # Start of the current window
        
        for end in range(len(s)):
            if s[end] in last_index and last_index[s[end]] >= start:
                # Move the start pointer to the right of the last occurrence of s[end]
                start = last_index[s[end]] + 1
            
            # Update the last index of the current character
            last_index[s[end]] = end
            
            # Update the maximum length
            max_len = max(max_len, end - start + 1)
        
        return max_len
