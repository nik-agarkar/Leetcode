class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        if(n==0) return true;

        for(int i=0;i<arr.length;){  

            if(arr[i]==1){
                i+=2;
            }
            else if(arr[i]==0){
                if(i==arr.length-1 || (i+1<arr.length && arr[i+1]==0)){
                    n-=1;
                    if(n==0) 
                        return true;
                    else
                        i+=2;
                }
                else
                    i+=1;
            }
        }
        return (n==0);
    }
}

/***
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

[1,0,0,0,1], n = 1
 0 1 2 3 4

i= 0,2 
n= 1,0

n == 0 => true
i == 1 => i+2
i == 0 && i+1 == 0 => i=0 , n-1, i = i+2

[0,0,1,0,1,0,0], n = 2
 0 1 2 3 4 5 6

i= 0,2,4,6
n= 2,1

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false

[1,0,0,0,1,0,0]
 0 1 2 3 4 5 6
 
 i= 0,2,4
 n= 2,2,1
 */