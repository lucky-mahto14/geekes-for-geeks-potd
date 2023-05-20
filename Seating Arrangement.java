

class Solution {
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here
        if(n==0){
            return true;
        }
        if (m == 1 && n == 1 && seats[0] ==0) return true;
        if (m == 1 && n == 1 && seats[0] == 1) return false;
        if(m==1 && seats[0]==0 && n>1)return false;
        for (int i = 0; i < m; i ++) {
            //for starting index
                if(i==0 && seats[i+1]==0 && seats[i]==0){
                    seats[i]=1;
                    n--;
                }
                if(i>0 && i<m-1 && seats[i]==0 && seats[i+1]==0 && seats[i-1]==0){
                        seats[i]=1;
                        n--;
                }

                //for last index
            else if(i==m-1 && seats[i]==0 && seats[i-1]==0){
                seats[i]=1;
                n--;

                }
            //between start to end

        }
        if(n>0){
            return false;
        }
        else{
            return true;
        }

    }
}
        
