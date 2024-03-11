class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        if(arr1.length== 0 || arr2.length==0)
            return new int[]{};

        Map<Integer,Integer> hmap=new HashMap<>();

        for(int n:arr1){
            if(!hmap.containsKey(n))
                hmap.put(n,1);
        }

        for(int m:arr2){
            if(hmap.containsKey(m)){
                hmap.put(m,hmap.get(m)+1);
            }
        }

        List<Integer> ans=new ArrayList<>();
            
        for(Map.Entry<Integer,Integer> r: hmap.entrySet()){
            if(r.getValue()>1)
                ans.add(r.getKey());
        }
        int[] res = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        // res = ans.toArray(new int[0]);
        return res;
    }
}