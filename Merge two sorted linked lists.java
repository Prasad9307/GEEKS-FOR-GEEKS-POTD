class Solution {
    public static Node reverseList(Node crr,int ctr,int len){
        if(ctr == len-1){
            return crr;
        }
        Node nextNode = crr.next;
        while(nextNode != null){
            if(crr.data>nextNode.data){
                int temp=crr.data;
                crr.data=nextNode.data;
                nextNode.data=temp;
            }
            nextNode=nextNode.next;
        }
            
            reverseList(crr.next,ctr+1,len);
            return crr;
    }
    public static int countLen(Node head1 , int len){
        Node crr = head1;
        while(crr != null){
            crr=crr.next;
            len++;
        }
        return len;
    }
    Node sortedMerge(Node head1, Node head2) {
        Node cureent = head1;
        while(cureent.next!=null){
           cureent=cureent.next; 
        }
        cureent.next=head2;
        int length = countLen(head1,0);
       
        return reverseList(head1,0,length);
    }
}
