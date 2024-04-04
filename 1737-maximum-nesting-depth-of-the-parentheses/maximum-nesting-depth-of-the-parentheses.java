class Solution {
    public int maxDepth(String s) {
        int max = 0, counter = 0;
        Stack<Character> st=new Stack<>();
        
        for(char i:s.toCharArray()){
            if(i=='('){
                counter++;
                // st.push(i);
                max = Math.max(max,counter);
            } else if(i==')')
                counter--;
        }
        return max;
    }
}