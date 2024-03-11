class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Set<Integer> st = new HashSet<>();
        for(int num : arr1){
            st.add(num);
        } 
        List<Integer> l = new ArrayList<>();
        for(int num : arr2){
            if(st.contains(num)){
                l.add(num);
                st.remove(num);
            }
        }
        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        
        return result;
    }
}