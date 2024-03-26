class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        boolean[] flag=new boolean[arr.length+1];
        List<Integer> ans=new ArrayList<>();

        for(int n:arr){
            if(!flag[n])
                flag[n]=true;
            else
                ans.add(n);
        }
        return ans;
    }
}