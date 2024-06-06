class Solution {
    public List<String> commonChars(String[] words) {
        int[] letter=new int[26];
        List<String> res=new ArrayList<>();
        Arrays.fill(letter,Integer.MAX_VALUE);

        for(String word: words){
            int[] arr=new int[26];
            for(char c: word.toCharArray()){
                int ind = c -'a';
                ++arr[ind];
            }

            for(int i=0;i<26;i++){
                letter[i] = Math.min(arr[i],letter[i]);
            }
        }

        for(char c = 'a'; c <= 'z'; ++c) {
            while (letter[c - 'a']-- > 0) { 
                res.add("" + c); 
            }
        }

        return res;
    }
}
