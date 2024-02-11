class Solution {
    public void moveZeroes(int[] arr) {
        if(arr.length<=1)
            return;
        
        int zero_cnt =0;
        int ind=0, right=arr.length-1, left=0;
        
        while(left<=right){
            if(arr[left]==0){
                left++;
                continue;
            }else{
                arr[ind]=arr[left];
                ind++;
                left++;
            }
        }
        
        if(ind<arr.length){
            while(ind<arr.length){
                arr[ind]=0;
                ind+=1;
            }
        }
        return;
    }
}