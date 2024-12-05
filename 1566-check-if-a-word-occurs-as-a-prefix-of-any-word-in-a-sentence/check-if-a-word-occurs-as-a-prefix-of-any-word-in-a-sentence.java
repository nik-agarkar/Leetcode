class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] words = sentence.split(" ");
        int i=0;
        for(String word: words){
            i+=1;
           if(word.startsWith(searchWord))
            return i;     
        }
        return -1;
    }
}