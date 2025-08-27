class Solution {
    public int areaOfMaxDiagonal(int[][] dm) {
        int n = dm.length;
        int maxArea =0, maxDiag = 0;

        for(int i=0;i<n;i++) {
            int len = dm[i][0];
            int wid = dm[i][1];
            int diag = (len*len) + (wid*wid);
            if(diag > maxDiag || (diag == maxDiag && len*wid > maxArea)){
                maxDiag = diag;
                maxArea = len*wid;
            }
        }
        return maxArea;
    }
}