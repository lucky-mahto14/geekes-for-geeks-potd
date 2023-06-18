

//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
       boolean dp[][]=new boolean[S.length()][S.length()];
        int maxlen=0;
        String ans="";
        int n=S.length();
        if(n<2){
            return S;
        }
        for(int gap=0;gap<S.length();gap++) {
            for(int i=0,j=gap;j<S.length();i++,j++) {
                if(gap==0) {
                    dp[i][j]=true;
                }
                else if(gap==1) {
                    if(S.charAt(i)==S.charAt(j)) {
                        dp[i][j]=true;
                    }
                    else {
                        dp[i][j]=false;
                    }
                }
                else {
                    if(S.charAt(i)==S.charAt(j) && dp[i+1][j-1]==true) {
                        dp[i][j]=true;
                    }
                    else {
                        dp[i][j]=false;
                    }
                }
                int len=j-i+1;
                if(dp[i][j] && len>maxlen) {
                    maxlen=len;
                    ans=S.substring(i,i+maxlen);
                }
            }
        }
        return ans;
}
}
