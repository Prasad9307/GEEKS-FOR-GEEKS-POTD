Given the head of two singly linked lists num1 and num2 representing two non-negative integers. The task is to return the head of the linked list representing the sum of these two numbers.

For example, num1 represented by the linked list : 1 -> 9 -> 0, similarly num2 represented by the linked list: 2 -> 5. Sum of these two numbers is represented by 2 -> 1 -> 5.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Examples:

Input: num1 = 4 - > 5, num2 = 3 -> 4 -> 5
Output:  3 -> 9 -> 0
 
Explanation: Given numbers are 45 and 345. There sum is 390.
Input: num1 = 0 -> 0 -> 6 -> 3, num2 = 0 -> 7 
Output: 7 -> 0 
 
Explanation: Given numbers are 63 and 7. There sum is 70.
Constraints:
1 <= size of both linked lists <= 106
0 <= elements of both linked lists <= 9

class Solution:
    def addTwoLists(self, num1, num2):
        sys.set_int_max_str_digits(1000000)
        f1=''
        f2=''
        temp=num1
        while temp:
            f1+=str(temp.data)
            temp=temp.next
        temp=num2
        while temp:
            f2+=str(temp.data)
            temp=temp.next
        f1=str(int(f1)+int(f2))
        head=None
        temm=head
        for i in f1:
            n=Node(int(i))
            if not head:
                head=n
                temm=head
            else:
                temm.next=n
                temm=temm.next
        return head

