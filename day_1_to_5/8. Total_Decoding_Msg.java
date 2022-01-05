//problem link: https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/#

class Solution
{
    public int CountWays(String str)
    {
        int dp[] = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        
        if(str.charAt(0) == '0'){
            return 0;
        }
        for(int i = 2;i<=str.length();i++){
            int c1=0,c2=0;
            dp[i] = 0;
            if(str.charAt(i-1) > '0'){
                c1 = dp[i-1];
            }
            if(str.charAt(i-2)=='1' || str.charAt(i-2) == '2' && str.charAt(i-1) < '7'){
                c2 = dp[i-2];
            }
            dp[i] = (c1+c2)%1000000007;
        }
        return dp[str.length()];
    }
    
}
