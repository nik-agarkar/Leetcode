class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        int i=0,j=0;
        while(j<n){
            freq.put(nums[j],freq.getOrDefault(nums[j],0) +1);
            while(freq.get(nums[j]) > k){
                freq.put(nums[i], freq.get(nums[i])-1);
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}

/**
nums = [1,2,3,1,2,3,1,2], k = 2
freq = [{1,2},{2,2},{3,2}]
n = 8
ans = 0,1,2,3,4,5
i = 0,1,2,3
j = 0,1,2,3,4,5,6,7
nums = [1,2,1,2,1,2,1,2], k = 1
nums = [5,5,5,5,5,5,5], k = 4
 */