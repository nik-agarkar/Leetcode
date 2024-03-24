class Solution {
    public int findDuplicate(int[] nums) {
        int[] dup = new int[nums.length+1];
        for(int i : nums){
            dup[i]++;
        }
        for(int i = 0;i<dup.length; i++){
            if(dup[i]>=2)return i;
        }
        return -1;
    }
}