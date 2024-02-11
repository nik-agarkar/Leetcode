class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int cur = 0;
        
        for(int num:gain){
            cur += num;
            max = Math.max(cur,max);
        }
        return max;
    }
}