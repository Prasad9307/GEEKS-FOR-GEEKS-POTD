Given the head of a singly linked list, your task is to left rotate the linked list k times.

Examples:

Input: head = 10 -> 20 -> 30 -> 40 -> 50, k = 4
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40

Input: head = 10 -> 20 -> 30 -> 40 , k = 6
Output: 30 -> 40 -> 10 -> 20 
 
Constraints:

1 <= number of nodes <= 105
0 <= k <= 109
0 <= data of node <= 109


class Solution:
    
    #Function to rotate a linked list.
    def rotate(self, head, k):
        l = []
        while head:
            l.append(head.data)
            head = head.next
        k = k%len(l)
        new = l[k:]+l[:k]
        new_head = Node(new[0])
        current = new_head
        for i in range(1,len(new)):
            temp = Node(new[i])
            current.next = temp
            current = current.next
        return new_head
