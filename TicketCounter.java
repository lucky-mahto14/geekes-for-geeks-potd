

//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int K)
    {
        int start=1;
        int end=N;
        while(end>=start){
            start=start+K;
            if(start>end){
                return end;
            }
            else{
                end=end-K;
                if(end<start){
                    return start;
                }
            }
        }
        return 0;
    }
}
