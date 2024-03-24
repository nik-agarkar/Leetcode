class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hset=new HashSet<>();

        for(int i=0,j=nums.length-1;i<=j;){
            if(nums[i]==nums[j])
                return nums[i];
            else if(hset.contains(nums[i]))
                return nums[i];
            else if(hset.contains(nums[j]))
                return nums[j];
            hset.add(nums[i++]);
            hset.add(nums[j--]);
        }
        return -1;
    }
}