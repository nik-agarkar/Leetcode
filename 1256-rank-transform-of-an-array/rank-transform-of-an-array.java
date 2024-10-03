class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> tmap =new TreeMap<>();

        for(int val:arr) {
            tmap.put(val, tmap.getOrDefault(val,0)+1);
        }

        int rank =1;
        for(Map.Entry<Integer,Integer> entry: tmap.entrySet()) {
            tmap.put(entry.getKey(), rank);
            rank+=1;
        }

        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] = tmap.get(arr[i]);
        }

        return res;
    }
}

/**
Input: arr = [40,10,20,30]
Output: [4,1,2,3]

 */