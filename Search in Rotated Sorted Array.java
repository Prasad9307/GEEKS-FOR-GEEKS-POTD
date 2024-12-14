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
